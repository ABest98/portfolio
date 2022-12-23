<template>
  <div id="project-container">
    <div class="quick-card" v-on:click="getProject(project.projectName)" v-show='hideAll' v-for='project in $store.state.projectObj' v-bind:key='project.id'>
      <h1 class="pro-name">{{ project.projectName }}</h1>
    </div>
    <div id="project-card" v-on:click='showAll()' v-show='showCard'>
        <h1 class="pro-name">{{ exactProject.projectName }}</h1>
        <p class="pro-desc">{{ exactProject.projectDesc }}</p>
      </div>
  </div>
</template>

<script lang='ts'>
import { defineComponent } from 'vue'

interface Project {
  projectId: number,
  projectName: String,
  projectDesc: String
}

export default defineComponent({
  data () {
    return {
      exactProject: {} as Project,
      hideAll: true,
      showCard: false
    }
  },

  methods: {
    getProject (name: string) {
      this.$store.state.projectObj.forEach((element: Project) => {
        if (element.projectName === name) {
          this.hideAll = false
          this.exactProject = element
          this.showCard = true
        }
      })
    },
    showAll () {
      this.hideAll = true
      this.showCard = false
    }
  }
})
</script>

<style lang="scss">
@import "../styles/base";

div#project-container {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  justify-content: space-around;
  align-content: space-between;
}

div.quick-card {
  box-shadow: 0px 0px 15px $Comp-to-logpass,
              0px 0px 10px $Yoon-3;
  border-radius: 15px;
  width: 350px;
  height: 300px;
  margin: 25px;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;

    p.pro-desc {
      margin: 0 10px 0 10px;
      display: none;
    }

    &:hover {
      width: 380px;
      height: 300px;
      box-shadow: 0px 0px 15px yellow,
                  0px 0px 10px $Yoon-3;
    }
}

div#project-card {
  width: 800px;
  height: 600px;
  box-shadow: 0px 0px 15px $Comp-to-logpass,
              0px 0px 10px $Yoon-3;
  border-radius: 20px 80px;
}
</style>
