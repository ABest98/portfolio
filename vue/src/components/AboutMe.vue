<template>
  <div id="about">
    <img src="../assets/Me.jpg" alt="" class="my-pic">
    <h1>About Me</h1>
    <p class="about-bio">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
  </div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
@import "../styles/base";

  div#about {
    display: flex;
    flex-direction: column;
    justify-content: center;
    background: none;
    box-shadow: 0px 0px 25px $Elite-1,
                0px 0px 10px $Yoon-3;
    width: 50vw;
    height: 50vh;
    align-items: center;
    border-radius: 90px 20px;
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

    img {
      width: 150px;
      height: 150px;
      border-radius: 35px;
      border: 3px solid rgba(114,55,242, .8);
      box-shadow: 0px 0px 25px $Elite-1,
                  0px 0px 10px $Yoon-3;
    }

    p.about-bio {
      margin: 0 30px 0 30px;
      text-align: start;
    }
  }

</style>
