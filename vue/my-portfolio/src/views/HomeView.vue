<template>
  <div class="home">
    <IntroHello />
  </div>
</template>

<script>
import IntroHello from '@/components/IntroHello.vue'

export default {
  name: 'HomeView',
  components: {
    IntroHello
  }
}
</script>
<style>
div.home {
  display: flex;
  flex-direction: row;
  justify-content: center;
}

</style>
