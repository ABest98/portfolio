<template>
  <div id="hello">
    <div class="intro">
      <img src="../assets/Me.jpg" alt="">
      <h1>Hello World</h1>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum</p>
    </div>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
@import "../styles/base";
  div#hello {
    display: flex;
    flex-direction: row;
    justify-content: center;
    background: linear-gradient(45deg, $PKP-3-rgba, $PKP-1-rgba, $PKP-4-rgba);
    width: 50vw;
    height: 50vh;
    align-items: center;
    border-radius: 30px 60px;
    border: solid red 5px;
  }
  div.intro {
    display: grid;
    grid-template-areas: 'pic name name'
                         'par par par';
    grid-template-columns: .5fr 1fr 1fr;
    grid-template-rows: 1fr 1fr;
    img {
      width: 150px;
      height: 150px;
      grid-area: pic;
      border-radius: 2rem;
      margin-left: 1rem;
      border: 5px solid red;
    }
    h1 {
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: $base-font-size * 2;
      grid-area: name;
      border: 5px solid red;
      margin-left: 1rem;
      margin-right: 1rem;
    }
    p {
      grid-area: par;
      margin-right: 1rem;
      margin-left: 1rem;
      border: 5px solid red;
    }
  }
</style>
