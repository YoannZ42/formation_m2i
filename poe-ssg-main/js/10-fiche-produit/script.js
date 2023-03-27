/**
 * sélectionner et stocker toutes les vignettes
 * sélectionner et stocker l'image grand format
 * sélectionner et stocker le bouton
 *
 *
 * ajouter un événement à chaque élément du tableau
 * récupérer le src de l'image cliquée
 *
 * utiliser le src et remplacer le src grand format
 *
 *
 * ajouter un événement au clic sur le bouton et incrémenter un compteur
 * afficher le compteur dans la page (avec conditions)
 */

const imgs = document.querySelectorAll('.small');
//console.log(imgs);
const fullImg = document.getElementById('full');
console.log(fullImg);
// Je sélectionne le bouton
const btn = document.querySelector('.btn-add');
console.log(btn);

// initialise un compteur
let compteur = 0;
// Je sélectionne la DIV panier-container
const panierContainer = document.querySelector('.panier-container'); 

imgs.forEach(function (item) {
  item.addEventListener('click', function () {
    console.log(item.getAttribute('src'));
    let imgSource = item.getAttribute('src');

    fullImg.setAttribute('src', imgSource);
  });
});

btn.addEventListener('click', function () {
  // incrémenter un compteur
  compteur = compteur + 1;
  // J'affiche le contenu
  if (compteur < 2) {
    panierContainer.innerText =
      `Vous avez ${compteur} produit dans votre panier`;
  } else {
    panierContainer.innerText =
      'Vous avez' + ' ' + compteur + ' ' + 'produits dans votre panier';
  }
});
