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
      hideAll: true as Boolean,
      showCard: false as Boolean
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
  }

  div#project-card {
    width: 800px;
    height: 600px;
    box-shadow: 0px 0px 15px $Comp-to-logpass,
                0px 0px 10px $Yoon-3;
    border-radius: 20px 80px;
  }

  @media screen and (max-width: $small-width) and (max-height: $small-height) {

    div.quick-card {
      flex-direction: row;
      align-content: space-around;
      flex-wrap: wrap;
      width: 100px;
      height: 100px;
      box-shadow: none !important;
      margin: 0;

      h1 {
        font-size: 1rem;
      }
    }

    div#project-card {
      width: 300px;
      height: 300px;
      box-shadow: none !important;
      border-radius: 20px 80px;
    }
  }

  @media screen and (min-width: $med-width) and (min-height: $med-height) {

    div.quick-card {
      width: 250px;
      height: 200px;

      h1 {
        font-size: 1rem;
      }
    }

    div#project-card {
      width: 500px;
      height: 450px;
      border-radius: 20px 80px;
    }
  }
}
</style>
