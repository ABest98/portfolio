<template>
  <div id="project">
    <ProjectCard />
  </div>
</template>

<script>
import ProjectCard from '@/components/ProjectCard'
export default {
  components: {
    ProjectCard
  }
}
</script>

<style lang="scss">
@import "../styles/base";

  div#project {
    display: flex;
    flex-direction: column;
    justify-content: center;
    background: none;
    box-shadow: 0px 0px 25px $Logpass-3,
                0px 0px 10px $Yoon-3;
    width: 50vw;
    height: 800px;
    align-items: center;
    border-radius: 20px 90px;
    color: $Yoon-1;
    animation: fadeIn 1s;

    @keyframes fadeIn {
      from{
        opacity: 0;
      }
      to {
        opacity: 1;
      }
    }

    @media screen and (max-width: $small-width) and (max-height: $small-height) {
      flex-direction: row;
      justify-content: space-between;
      flex-wrap: wrap;
      box-shadow: none !important;
      margin: 0;
      width: 300px;
      height: 300px;
    }

    @media screen and (min-width: $med-width) and (min-height: $med-height) {
      flex-direction: row;
      justify-content: space-between;
      flex-wrap: wrap;
      width: 55vw;
      height: 90vh;
    }
  }

</style>
