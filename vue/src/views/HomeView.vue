<template>
  <div class="home">
    <IntroHello v-if="$store.state.homePage"/>
    <AboutMe v-if="$store.state.aboutMe"/>
    <MyProjects v-if="$store.state.projects"/>
    <SideBar />
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator'
import IntroHello from '@/components/IntroHello.vue'
import SideBar from '@/components/SideBar.vue'
import AboutMe from '@/components/AboutMe.vue'
import MyProjects from '@/components/MyProjects.vue'

@Component({
  components: {
    IntroHello,
    SideBar,
    AboutMe,
    MyProjects
  }
})
export default class HomeView extends Vue {}
</script>

<style lang="scss">
div.home {
  display: flex;
  flex-direction: row;
  justify-content: center;
}

</style>
