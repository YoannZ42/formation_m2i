/**
 *
 * sélectionner et stocker le bouton
 * détecter le clic sur le bouton
 */
// console.log('connecté');
const btn = document.getElementById('btn');
// console.log(btn);
const ctn = document.getElementById('content');

btn.addEventListener('click', function () {
  // getData();
  getList();
});

async function getData() {
  console.log('cliqué');
  // faire un appel vers l'api
  // https://jsonplaceholder.typicode.com/todos/1

  // fetch(url)
  // récupérer un objet JSON
  // convertir l'objet en pur objet JS
  // afficher dans la page

  //   fetch('https://jsonplaceholder.typicode.com/todos/1')
  //     .then((response) => response.json())
  //     .then((json) => console.log(json));

  // DUO async/await
  const reponseJSON = await fetch(
    'https://jsonplaceholder.typicode.com/todos/1'
  );
  console.log(reponseJSON);

  const reponseJS = await reponseJSON.json(); // transformer en pur objet JS
  console.log(reponseJS);
  // afficher reponseJS
  ctn.innerHTML = `<div>
                        <h1>${reponseJS.title}</h1>
                        <h2>${reponseJS.completed}</h2>
                    </div>
                  `;
}

// créer nouvelle fonction getList()
// appel vers l'api
// récupérer l'objet JSON
// transformer en objet JS
// Afficher dans la page

async function getList() {
  const reponseJSON = await fetch('https://jsonplaceholder.typicode.com/posts');
  // console.log(reponseJSON);

  const reponseJS = await reponseJSON.json();
  //console.log(typeof reponseJS); // array

  // tableau = boucle
  reponseJS.forEach(function (item) {
    // console.log(item.title); // chacun des objets du tableau

    const obj = `<li class=''>${item.title}</li>`; 
    console.log(obj);

    ctn.innerHTML += obj; 

  });
}
