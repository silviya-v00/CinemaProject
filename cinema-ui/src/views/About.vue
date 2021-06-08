<template>
  <div class="about">
    <h1  class="pt-5 pb-5" id="title">Най-новите ни предложения</h1>
    <b-container>
      <b-row align-v="center">
        <div class="row">
          <div v-for="fil in film" :key="fil" class="col-sm-3 pb-4 pr-2" >
              <div class="card" style="width:15rem; height: 100%">
                <img src="https://media.istockphoto.com/photos/movie-clapper-and-popcorn-bag-picture-id963205168?k=6&m=963205168&s=612x612&w=0&h=PARQL_Vqh0sU3pgd97bEJtzMqHOdExLp6rHvq3UrEAM=" />
                <div class="card-body">
                  <h5 class="card-title">{{fil.name}}</h5>
                  <p class="card-text">{{fil.genre}}</p>
                  <p class="card-text">{{fil.video_format}}</p>
                  <p class="card-text">{{fil.ticket_price}}</p>
                </div>
              </div>
          </div>
        </div>
      </b-row>
    </b-container>
  </div>
</template>

<script>
// @ is an alias to /src
import NewService from '../services/new-service'
// import Information from "./Information";

export default {
  name: 'Film', // components: {Information}
  data () {
    return {
      film: [{
        name: '',
        genre: '',
        cover_art: '',
        summary: '',
        video_format: '',
        ticket_price: ''
      }]
    }
  },
  mounted () {
    NewService.getAllFilms().then(
      response => {
        console.log(response)
        this.film = response.data
      },
      error => {
        this.content =
          (error.response && error.response.data) ||
          error.message ||
          error.toString()
      }
    )
  },
  methods: {
    uploadImg: function () {
      var reader = new FileReader()
      reader.onload = function (e) {
        this.film.cover_art = e.target.result
      }
      reader.onerror = function (error) {
        alert(error)
      }
    }
  }
}
</script>

<style scoped>
#title{
  font-weight: bold;
  font-family:"Times New Roman" ;
  color:white;
  font-size: 50px;
}
.about{
  background-color: darkred;
  padding-bottom: 50px;
}
</style>
