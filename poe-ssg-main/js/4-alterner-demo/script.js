console.log('connecté');

/**
 * cibler et stocker le bouton btn
 * cibler et stocker le carre
 *
 * au clic sur le bouton,
 *
 * le contenu du bouton change
 * si le texte est === BLEU, alors
 * le texte devient ROUGE
 *
 * la couleur de fond du carre change
 *
 */
const btn = document.getElementById('btn');
console.log(btn);
const carre = document.querySelector('.carre');
console.log(carre);

btn.addEventListener('click', function () {
  console.log('cliqué');
  let contenu = btn.innerText;
  console.log(contenu);

  if (btn.innerText === 'BLEU') {
    console.log('devient rouge');
    btn.innerText = 'ROUGE';
  } else {
    console.log('devient bleu');
    btn.innerText = 'BLEU';
  }

  // méthode pour appliquer ou enlever une classe
  // element.classList.toggle('classe');
  carre.classList.toggle('blue');

});
