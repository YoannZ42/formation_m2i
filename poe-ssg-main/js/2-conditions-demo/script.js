console.log('connecté');

// créer une variable de type number
// let ou const ???
let score = 5;

// if(condition à vérifier){ // action}
// Si score est égal à 0 alors on affiche score est 0
// Si score est compris entre 1 et <5 , on affiche le message
// Sinon, message, test réussi

if (score === 0) {
  console.log('score est de 0');
} else if (score >= 1 && score < 5) {
  console.log('score entre 1 et 4');
} else {
  console.log('bravo');
}

// opérateur == ou ===
let str = '1'; // type string
let num = 1; // type number

if (str === num) {
  console.log('egal');
}
// == js compare les valeurs
// === js compare les typages et puis les valeurs

let message = ' Hello';
// modifier la casse de la variable
// toLowerCase()
message = message.toUpperCase();
// retirer les espaces avant et après la chaine de caractères
message = message.trim();


if (message === 'HELLO') {
  console.log('les mêmes mots');
} else {
  console.log('mots différents');
}
