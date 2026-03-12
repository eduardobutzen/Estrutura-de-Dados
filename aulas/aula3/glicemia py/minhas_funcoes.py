from glicemia import Glicemia


def popular_lista_arquivo(lista, nome_base):

    leitor = open(nome_base, "r", encoding="utf-8")

    for linha in leitor:

        linha = linha.strip()
        vetor_linha = linha.split(",")

        valor = int(vetor_linha[0])
        data = vetor_linha[1]
        hora = vetor_linha[2]

        obj = Glicemia(valor, data, hora)

        lista.append(obj)

    leitor.close()


def imprimir_lista(lista):

    for item in lista:
        print(item)


def calcular_media(lista):

    soma = 0

    for item in lista:
        soma += item.valor

    media = soma / len(lista)

    return media


def calcular_mediana(lista):

    valores = []

    for item in lista:
        valores.append(item.valor)

    valores.sort()

    n = len(valores)

    if n % 2 == 0:
        mediana = (valores[n//2 - 1] + valores[n//2]) / 2
    else:
        mediana = valores[n//2]

    return mediana