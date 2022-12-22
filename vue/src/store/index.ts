import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

interface Project {
  projectId: number,
  projectName: String,
  projectDesc: String,
}

export default new Vuex.Store({
  state: {
    homePage: true,
    aboutMe: false,
    projects: false,
    projectObj: [{}]
  },
  getters: {
  },
  mutations: {
    SAVE_PROJECT (state, data: Project) {
      state.projectObj.push(data)
    }
  },
  actions: {
  },
  modules: {
  }
})
