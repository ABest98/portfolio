<template>
  <div id="hello">
    <div class="intro">
      <p>Hi, my name is</p>
      <h1>Alex Best.</h1>
      <p class="intro-bio">An aspiring fullstack developer</p>
      <p>Junior Software Developer with a strong strategic, adaptable, and determined background, eager to mature technical skill-sets while utilizing diverse professional experience to support and innovate your organization.</p>
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
    background: none;
    box-shadow: 0px 0px 25px $Opera-3,
                0px 0px 10px $Yoon-3;
    width: 50vw;
    height: 50vh;
    align-items: center;
    border-radius: 20px 90px;
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

    @media screen and (max-width: $small-width) and (max-height: $small-height) {
      width: 350px;
      height: 250px;
      box-shadow: none !important;

      div.intro {
        flex-direction: row;
        flex-wrap: wrap;
        margin-bottom: 15%;

        p.intro-bio {
          font-size: 1rem;
        }
      }
    }
  }
  div.intro {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    h1 {
      margin: $base-margin;
      font-size: 3rem;
      color: $Yoon-2;
    }
    p {
      margin: $base-margin;
      font-size: 1rem;
      text-align: start;
      color: $Opera-2;
    }
    p.intro-bio {
      font-size: 2rem;
      color: $Yoon-3;
    }
  }
</style>
