<template>
  <div class="home">
    <IntroHello />
    <SideBar />
  </div>
</template>

<script>
import IntroHello from '@/components/IntroHello.vue'
import SideBar from '@/components/SideBar.vue'

export default {
  name: 'HomeView',
  components: {
    IntroHello,
    SideBar
  }
}
</script>
<style lang="scss">
div.home {
  display: flex;
  flex-direction: row;
  justify-content: center;
}

</style>
