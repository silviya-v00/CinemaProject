import axios from 'axios'
const API_URL = 'http://localhost:8080/client'

class TicketService {
  getAllClients () {
    return axios.get(API_URL + '/allClients')
  }

  saveClient (fd, form) {
    return axios.post(API_URL + '/addClient', fd,
      {
        params: {
          holder_first_name: form.holder_first_name,
          holder_last_name: form.holder_last_name,
          email: form.email,
          count_tickets: form.count_tickets,
          price: form.price,
          date: form.date,
          type: form.type
        }
      })
  }

  saveClientDB (form) {
    return axios.post(API_URL + '/addClient/save',
      {
        holder_first_name: form.holder_first_name,
        holder_last_name: form.holder_last_name,
        email: form.email,
        count_tickets: form.count_tickets,
        price: form.price,
        date: form.date,
        type: form.type
      })
  }
}
export default new TicketService()
