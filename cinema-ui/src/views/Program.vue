<template>
  <div class="table pl-5 pr-5 pt-1" >
    <b-table
      striped
      hover
      bordered
      dark
      :table-variant="tableVariant"
      :items="film"
      :fields="fields"
    >
    </b-table>
  </div>
</template>

<script>
import NewService from '../services/new-service'

export default {
  name: 'Film',
  data () {
    return {
      film: [{
        video_format: '',
        id: '',
        name: '',
        ticket_price: '',
        genre: '',
        cover_art: '',
        summary: '',
        film_actors:
          {
            id: '',
            name: ''
          }
      }],
      fields: [
        { key: 'name', label: 'Филм' },
        { key: 'summary', label: 'Резюме' },
        { key: 'video_format', label: 'Видео формат' },
        { key: 'genre', label: 'Жанр' },
        { key: 'ticket_price', label: 'Билет' },
        { key: 'time', label: 'Часове' }
      ],
      tableVariant: ['danger']
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
  }
}
</script>

<style scoped>

</style>
