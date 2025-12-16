INSERT INTO Dish (id, name, dish_type)
VALUES (1, 'Salade fraiche'. 'START'),
       (2, 'Poulet grille', 'MAIN'),
       (3, 'Riz aux legumes', 'MAIN'),
       (4, 'Gateaux au chocolat', 'DESSERT'),
       (5, 'Salade de fruits', 'DESSERT');

SELECT setval('public.dish_id_seq', 5, true);

INSERT INTO Ingredient (id, name, price, category, id_dish)
VALUES (1, 'Laitue', 800.00, 'VEGETABLE', 1),
       (2, 'Tomate', 600.00, 'VEGETABLE', 1),
       (3, 'Poulet',4500.00,'ANIMAL', 2),
       (4, 'Chocolat', 3000.00, 'OTHER', 4),
       (5, 'Beurre',  2500.00. 'DAIRY', 4);

SELECT setval('public.ingredient_id_seq', 5, true);


