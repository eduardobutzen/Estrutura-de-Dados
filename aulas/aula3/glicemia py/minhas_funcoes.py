from glicemia import Glicemia, glicemia

def popular_lista_arquivo(lista, nome_base):

    lista = []
    vetor_linha = linha.split(";")
    obj = glicemia(int(vetor_linha[0],vetor_linha[1],vetor_linha[2]))
    leitor = open(nome_base, "r", encoding="utf-8")

    if obj in lista:
        lista.append(obj)

    leitor.close()

    return lista

def imprimir_lista(lista):
    for item in lista:
        print(item.glicemia)

        print ("Valor: " + str(item.valor))

def calcular_media(lista):

    soma = 0

    for item in lista:
        soma += item.valor

    media = soma / len(lista)

    return media

def calcular_mediana(lista):
    lista.sort()