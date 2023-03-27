// 1 seul élément : .getElementById, querySelector('.class')
// cibler plusieurs éléments
// une classe commune à tous ces éléments
const imgs = document.querySelectorAll('.img');
//console.log(imgs);

//console.log(imgs[0]);
//console.log(imgs.length); // longueur de tableau

// element.addEventListener

// itérer dans le tableau
// tab.forEach()
imgs.forEach(function (item) {
  // console.log(item);

  //   item.addEventListener('click', function () {
  //     console.log(item);
  //   });

  // mouseenter
  // mouseleave

  item.addEventListener('mouseenter', function () {
    //console.log(item);
    console.log(item.getAttribute('src'));

    // imgGrandFormat.setAttribute('src', nouvelleValeur)
    item.style.filter = 'blur(10px)';
  });

  item.addEventListener('mouseleave', function () {
    //console.log(item);
    item.style.filter = 'blur(0px)';
  });
});
