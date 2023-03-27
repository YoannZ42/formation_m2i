
STEP 1: CREER LES ENTITY, SERVICE, REPOSITORY

Table Client :
    companyName;
    firstName;
    lastName;
    email;
    phone;
    address;
    zipCode;
    city;
    country;
    state;  //  INACTIVE:0    ACTIVE:1



Table Order :
    typePresta;
    designation;
    nbDays;
    unitPrice;
    state; // CANCELLED:0 OPTION:1 CONFIRMED:2
    client; // Many To One Client
    


STEP 2: CREER LES CONTROLLERS

Liste des routes dans les controllers : 

GET localhost:8080/client -> FindAll()
GET localhost:8080/client/{id} -> FindById(id)
POST localhost:8080/client -> save(client)
PUT localhost:8080/client/{id} -> update(client, id)
DELETE localhost:8080/client/{id} -> delete(id)


GET localhost:8080/order -> FindAll()
GET localhost:8080/order/{id} -> FindById(id)Une order est forcément liée à un clien
POST localhost:8080/order -> save(order)    (t !)
PUT localhost:8080/order/{id} -> update(order, id)
DELETE localhost:8080/order/{id} -> delete(id)


STEP 3: CREER LES FAKERS DE CES ENTITIES

STEP 4: CREER DES VALIDATEURS POUR CES ENTITIES

STEP 5(optional): AJOUTER UN SWAGGER