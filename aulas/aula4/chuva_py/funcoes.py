from chuva import chuva

def lista_arquivo(lista, dados):

    try:

        #abrindo modo de leitura
        leitor = open(dados, "r", encoding="utf-8")

        #passando pelo arquivo, linha por linha
        for linha in leitor:
            dados_linha = linha.split(",")
            obj_chuva = chuva (dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

            if obj_chuva not in lista:
                lista.append(obj_chuva)


            for item in lista:
                print (item, end="")

        leitor.close()

    except Exception as e:
        print("Ocorreu um erro", e)




def exibir_lista(lista):
    
    for item in lista:
        print(item)

    
