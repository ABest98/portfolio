<template>
  <div id="hello">
    <div class="intro">
      <img src="../assets/Me.jpg" alt="">
      <h1>Hello World</h1>
      <p>Something Something Something</p>
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
    background: $PKP-1-rgba;
    width: 50vw;
    height: 50vh;
    align-items: center;
  }
  div.intro {
    img {
      width: 100px;
      height: 100px
    }
    h1 {
      font-size: $base-font-size * 2;
    }
    p {

    }
  }
</style>
