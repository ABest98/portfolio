import axios from 'axios'

export default {
  getProjects () {
    return axios.post('/project')
  }
}
