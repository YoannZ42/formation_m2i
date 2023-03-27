/**
 * https://developer.mozilla.org/fr/docs/Web/API/Window/localStorage
 */

// créer un local storage
localStorage.setItem('nom', 'Durand');

console.log(localStorage.getItem('nom')); // Durand

content.innerHTML = localStorage.getItem('nom');

const tab = [
  {
    user: 'user 1',
    age: 23,
  },
  {
    user: 'user 2',
    age: 26,
  },
];

// stocker le tableau
// localStorage n'accepte que les chaines de caractères !
localStorage.setItem('tab', JSON.stringify(tab));
// convertir en objet JS
const res = JSON.parse(localStorage.getItem('tab')); 

res.forEach(item=>{
    console.log(item);
})

// Je vérifie le contenu de localStorage
const stockage = window.localStorage; 
console.log(stockage); 

