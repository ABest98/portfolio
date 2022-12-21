<template>
  <div id="app">
     <!--<nav>
      <router-link to="/">Home</router-link> |
    </nav> -->
    <router-view/>
  </div>
</template>

<style lang="scss">
@import "styles/base";
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
}

html {
   background: $Yoon-5;
}

nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
