console.log('connecté');
/**
 * cibler et stocker le btn
 * cibler et stocker le contenant
 * au clic sur le btn, déclencher fonction getImg()
 * getImg() => appel API
 *
 * <img class='img-artist' src='' alt='' />
 * <h1>Artiste : User Name</h1>
 * <p>Découvrez son univers : récupérer la bio</p>
 * <div class='btn'>
 *  <a class='btn-insta' href='lien'>Je découvre</a>
 * </div
 *
 */
const btn = document.getElementById('refresh');
console.log(btn);
const ctn = document.getElementById('resultat');

getImg();


btn.addEventListener('click', function () {
  console.log('click');
  getImg();
});

async function getImg() {
  try {
    const responseJSON = await fetch(
      'https://api.unsplash.com/photos/random/?client_id=P_JCZQoZqygP08HwAcKV1Vw_IUQR0TUACeDEHHDBkd0'
    );

    // transformer en objet JS
    const reponseJS = await responseJSON.json();
    console.log(reponseJS);

    ctn.innerHTML = `
                    <img class='img-artist' 
                    src="${reponseJS.urls.regular}" 
                    alt="${reponseJS.description}"
                    />
                    <h1>Artiste : ${reponseJS.user.name}</h1>
                    <p>Découvrez son univers :
                    ${
                      reponseJS.user.bio
                        ? reponseJS.user.bio
                        : 'Désolé, info manquante'
                    }    
                    </p>
                    <div class="btn">
                     <a class="btn-insta" target="_blank"
                              href="https://instagram.com/${
                                reponseJS.user.instagram_username
                              }">
                                Je découvre sur Instagram
                      </a>
                    </div>
                        `;
  } catch (err) {
    console.log(err);
  }
}


// if(var){
// // ici var est true
// }else{
// // ici var est false
// }
// // operateur ternaire
// condition1 ? resultatTrue : resultatFalse
// ${ condition1 ? resultatTrue : resultatFalse }

// try{
//   // appel http
// }catch(error){
//   // récupérer l'erreur
//   // logs
// }