import axios from 'axios'
const API_URL = 'http://localhost:8080/film'

class NewService {
  getAllFilms () {
    return axios.get(API_URL + '/all')
  }
}
export default new NewService()
