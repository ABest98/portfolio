<template>
  <div id="side-bar">
    <button class='btn' v-on:click='original()' type="button">Intro</button>
    <button class='btn' v-on:click='changeColorBlue()' type="button">About Me</button>
    <button class='btn' v-on:click='changeColorGreen()' type="button">Projects</button>
    <button class='btn' v-on:click='changeColorPurple()' type="button">Languages</button>
    <button class='btn' type="button">Experience</button>
    <button class='btn' type="button">Contact Me</button>
  </div>
</template>

<script>
export default {

  methods: {
    original () {
      document.getElementById('side-bar').style.boxShadow = '0px 0px 25px rgba(114,26,26, 1), 0px 0px 10px rgba(89,89,89, 1)'
      this.$store.state.aboutMe = false
      this.$store.state.projects = false
      this.$store.state.homePage = true
    },
    changeColorBlue () {
      document.getElementById('side-bar').style.boxShadow = '0px 0px 25px rgba(114,55,242, 1), 0px 0px 10px rgba(89,89,89, 1)'
      this.$store.state.aboutMe = true
      this.$store.state.projects = false
      this.$store.state.homePage = false
    },
    changeColorGreen () {
      document.getElementById('side-bar').style.boxShadow = '0px 0px 25px rgba(21,191,128, 1), 0px 0px 10px rgba(89,89,89, 1)'
      this.$store.state.projects = true
      this.$store.state.aboutMe = false
      this.$store.state.homePage = false
    },
    changeColorPurple () {
      document.getElementById('side-bar').style.boxShadow = '0px 0px 25px rgba(9,13,89, 1), 0px 0px 10px rgba(89,89,89, 1)'
      document.getElementById('hello').style.boxShadow = '0px 0px 25px rgba(9,13,89, 1), 0px 0px 10px rgba(89,89,89, 1)'
    },
    revert () {
      document.getElementById('side-bar').style.boxShadow = '0px 0px 25px rgba(114,26,26, 1), 0px 0px 10px rgba(89,89,89, 1)'
    }
  }
}
</script>

<style lang="scss">
@import "../styles/base";
div#side-bar {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  align-items: center;
  background: none;
  width: 150px;
  margin-left: 4rem;
  border-radius: 90px 20px;
  box-shadow: 0px 0px 25px $Opera-3,
              0px 0px 10px $Yoon-3;

  .btn {
    border-radius: 25px;
    width: 6rem;
    height: 1.5rem;
    background: rgba(89,89,89, .5);
    border: none;
    color: $Yoon-2;
    box-shadow: 0px 0px 15px $Yoon-3,
                0px 0px 5px $Yoon-3;
  }

  .btn:hover {
    width: 7rem;
    height: 2rem;
    background: rgba(26,55,140, .5);
    box-shadow: 0px 0px 15px $PKP-3,
                0px 0px 5px $Yoon-3;
  }
}
</style>
