<template>
  <div id="color">
    <body>
          <div class="container">
            <div class="row">
              <div class="col-12">
                <div class="home">
                  <div id="carouselExampleIndicators" class="carousel slide mt-5" data-bs-ride="carousel">
                    <ol class="carousel-indicators">
                      <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"></li>
                      <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"></li>
                      <li data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img src="https://i.pinimg.com/originals/42/75/01/42750115d68a876558e7e0115b6600c8.jpg" width="1200" height="600">
                      </div>
                      <div class="carousel-item">
                        <img src="https://i.pinimg.com/originals/e0/02/70/e00270957104fdb69e4622633886ffd5.jpg"  width="1200" height="600" >
                      </div>
                      <div class="carousel-item">
                        <img src="https://www.theyoungfolks.com/wp-content/uploads/2016/02/Triple9_fb_share4.jpg"  width="1200" height="600" >
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-bs-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-bs-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Next</span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
    <div style="margin-top:25px"></div>
    <div class="description">
      Омръзна ли ви да живеете като в ужасно написан филм? Само сега имате шанса да избягате от скучното ежедневие <br>
      и да се потопите в магията на киното! В Cinema World ние се грижим за вашето спокойствие, защото то е наше <br>
      удоволствие. Най-големия кино свят на Балканите комбинира специално за вас иновативни технологии и първокласно <br>
      обслужване, за да Ви осигурим изживяване от световна класа!
    </div>
    <div>
      <div style="margin-top:25px"></div>
      <h3>Какво Ви предлагаме ние</h3>
      <div style="margin-top:25px"></div>
      <div class="container">
        <div class="row align-items-start">
          <div class="col">
            <img src="https://i2-prod.mirror.co.uk/incoming/article21480689.ece/ALTERNATES/s615/0_CineworldPlym-GalaOpening-Oct2019-52.jpg" height="136,79" class="img-thumbnail">
          </div>
          <div class="col">
            <img src="https://www.cinefish.bg/data/movies_images/212/p_212366.jpg" class="img-thumbnail" >
          </div>
          <div class="col">
            <img src="https://www.cinefish.bg/data/movies_images/249/p_249180.jpg" class="img-thumbnail" >
          </div>
        </div>
      </div>
    </div>
    </body>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#board{
  border-bottom: 1px solid white;
}
#foot{
  background-color: black;
  color: white;
  font-size: small;
}
h4 {
  margin-left:30px;
}
.description {
  list-style-type: none;
  padding: 1px;
  text-align: center;
  font-size: 19px;
  font-feature-settings: revert;
  font-weight: bold;
  font-family: Ink Free;
}
.contacts{
  text-align: left;
  font-family: Roman;
  font-size: 15px;
  margin-left: 30px;
  margin-bottom: 20px;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #FFC300;
}
h3{
  font-family: Ink Free;
  text-align: center;
  font-weight: revert;
}
.container {
  margin-bottom: 25px;
}
</style>
