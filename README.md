# PjBL4---Sorting-Algorithms (Arthur Correia Brígido)
Link do vídeo (youtube): https://www.youtube.com/watch?v=fqXXsOtVVEQ

O trabalho em questão demonstra o funcionamento de três diferentes algoritmos de ordenação, os quais têm o objetivo de ordenar uma lista de números em ordem crescente, e os algoritmos são:

. Bubble Sort (Ordenação por flutuação)
  .Método "sort" ->  Modifica o array no lugar, ordenando os elementos em ordem crescente sem usar nenhum array adicional.
 ![image](https://github.com/ArthurCorreiaBrigido/PjBL---Sorting-Algorithms/assets/51636263/5a1d0d8d-4751-42a7-af6d-0993b8550158)
 
. Insertion Sort (Ordenação por inserção)
- Método "sort" -> Ordena o array progressivamente construindo uma sequência ordenada de elementos na parte frontal do array. 
 ![image](https://github.com/ArthurCorreiaBrigido/PjBL---Sorting-Algorithms/assets/51636263/230771cb-f07d-49c5-a1e6-d6e44fff3dc9)

. Quick Sort (Ordenação por divisão e conquista)
  
- Método "sortArray" -> Interface para iniciar o processo de ordenação Quick Sort no array inteiro, chamando o quickSort com os índices iniciais e finais do array;
  
- Método "quickSort" -> Realiza a ordenação. Ele só procede se houver mais de um elemento no segmento do array a ser ordenado;
  
- Método "divide" -> O array é dividido em duas partes com base em um pivô escolhido, que é o 1º elemento do segmento do array em questão. O processo de divisão envolve rearranjar os elementos de modo que os menores que o pivô fiquem à sua esquerda e os maiores à sua direita.
  
- Método "swap" -> Quando dois elementos são identificados como estando na parte errada do pivô durante a divisão, eles são trocados de lugar.
 ![image](https://github.com/ArthurCorreiaBrigido/PjBL---Sorting-Algorithms/assets/51636263/c82a0179-fe60-4c70-8194-6e69a693e3da)

. Classe "Main"
  
- Declara o array original (49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28) e instancia cada uma das classes dos algoritmos para ordenar o array, o qual é clonado, impresso e finalmente é ordenado.
 
 ![image](https://github.com/ArthurCorreiaBrigido/PjBL---Sorting-Algorithms/assets/51636263/1babe2fd-53dd-41ca-a7b6-3d0793d372ce)
  
