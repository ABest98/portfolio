<template>
  <div id="side-bar">
    <h1>SIDEBAR</h1>
    <a href="">Something</a>
    <a href="">Something</a>
    <a href="">Something</a>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
div#side-bar {
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
  background: green;
  width: 150px;
  margin-left: 4rem;
  border-radius: 60px 15px;

  h1 {
    border: 5px solid red;
  }
  a {
    border: 5px solid red;
  }
}
</style>
