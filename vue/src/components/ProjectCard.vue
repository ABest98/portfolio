<template>
  <div>
    <div v-for='project in $store.state.projectObj' v-bind:key='project.id'>
      <h1>{{ project.projectName }}</h1>
      <p>{{ project.projectDesc }}</p>
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>
