<template id="tickets">
  <div class="row justify-content-center pt-lg-5 pl-lg-5 pr-lg-5">
    <body class="col-sm-9">
      <div class="tickets">
        <form class="row g-3">
          <div class="col-md-4">
            <label for="validationDefault01" class="form-label">Име на потребител</label>
            <input type="text" v-model="client.holder_first_name" class="form-control" id="validationDefault01" value="Въведете име" required>
          </div>
          <div class="col-md-4">
            <label for="validationDefault02" class="form-label">Фамилия на потребител</label>
            <input type="text" v-model="client.holder_last_name" class="form-control" id="validationDefault02" value="Въведете фамилия" required>
          </div>
          <div class="col-md-4">
            <label for="validationDefaultUsername" class="form-label">Е-мейл</label>
            <div class="input-group">
              <span class="input-group-text" id="inputGroupPrepend2">@</span>
              <input type="email" v-model="client.email" class="form-control" id="validationDefaultUsername"  aria-describedby="inputGroupPrepend2" required>
            </div>
          </div>
          <div class="col-md-3">
            <label for="validationDefault04" class="form-label">Вид билет</label>
            <select class="form-select" v-model="client.type" id="validationDefault04" required>
              <option selected disabled value="">Избери</option>
              <option >Ученически </option>
              <option>Нормален</option>
              <option>Пенсионерски</option>
            </select>
          </div>
          <div class="col-md-3">
            <label for="validationDefault04" class="form-label">Филм</label>
            <select class="form-control" id="film" required v-model="film.name">
              <option v-for="fil in film" :key="fil">
                {{fil.name}}
              </option>
            </select>
          </div>
          <div class="col-md-3">
            <label for="example-date-input" class="col-10">Дата</label>
            <div class="col-10">
              <input type="date" v-model="client.date" class="form-control" id="example-date-input">
            </div>
          </div>
          <div class="col-md-2">
            <label for="inputZip" class="form-label">Брой</label>
            <input type="text" v-model="client.count_tickets" class="form-control" id="inputZip">
          </div>
          <div class="col-12">
            <div class="form-check">
              <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
              <label class="form-check-label" for="invalidCheck2">
                Съгласявам се с правилата и услвия
              </label>
            </div>
          </div>
          <div class="col-12">
            <button class="btn btn-dark" v-on:click="saveClient">Запази билет</button>
          </div>
          <div class="gif"> <img src="https://media0.giphy.com/media/XBQPJta7PUOKmoZL05/giphy.gif?cid=6c09b952247e124d90962774587bf39a1ff716237eec96f3&rid=giphy.gif&ct=s" alt="Ticket gif"> </div>
        </form>
      </div>
    </body>
  </div>
</template>

<script>
import TicketService from '../services/ticket-service'
import NewService from '../services/new-service'

export default {
  name: 'Tickets',
  data () {
    return {
      message: '',
      client: {
        holder_first_name: ' ',
        holder_last_name: '',
        email: '',
        count_tickets: '',
        date: '',
        type: ''
      },
      film: {
        name: ''
      }
    }
  },
  methods: {
    setData (response) {
      this.client = response.data()
    },
    saveClient () {
      TicketService.saveClientDB(this.client).then(
        response => {
          console.log(response)
          this.client = response.data
        },
        error => {
          this.content =
            (error.response && error.response.data) ||
            error.message ||
            error.data.message.toString()
        })
    },
    priceTicket () {
      this.price = this.ticket_price * this.count_tickets
    }
  },
  mounted () {
    NewService.getAllFilms().then(
      response => {
        console.log(response)
        this.film = response.data
      }
    )
  }
}
</script>

<style scoped>
.gif {
  text-align: center;
  margin-bottom: 50px;
}
.form-check-label {
  color: red;
}
</style>
