<template>
  <div id="project-container">
    <div class="project-card" v-for='project in $store.state.projectObj' v-bind:key='project.id'>
      <h1 class="pro-name">{{ project.projectName }}</h1>
      <p class ="pro-desc">{{ project.projectDesc }}</p>
    </div>
  </div>
</template>

<script>
export default {

}
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
div.project-card {
  box-shadow: 0px 0px 15px $Comp-to-logpass,
                0px 0px 10px $Yoon-3;
  border-radius: 15px;
  width: 350px;
  height: 400px;
  margin: 25px;
  animation: fadeIn 3s;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;

    @keyframes fadeIn {
      from{
        opacity: 0;
      }
      to {
        opacity: 1;
      }
    }

    p.pro-desc {
      margin: 0 10px 0 10px;
    }
    &:hover {
      width: 450px;
    }
}
</style>
