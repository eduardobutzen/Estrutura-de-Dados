lista_nome = [1, 2, 3, 4, 5]

print(lista_nome)

#adicionar nomes a uma lista

lista_nome.append("Guilherme")
lista_nome.append("Eduardo")

print(lista_nome)

#remover um item da lista
if len(lista_nome) != 0:
    nome  = input("Digite um nome para remover da lista: ")

    if lista_nome.__contains__(nome):

        lista_nome.remove(nome)

    else:  

        print("O nome não existe na lista")

else :

    print("A lista está vazia")





print(lista_nome)
