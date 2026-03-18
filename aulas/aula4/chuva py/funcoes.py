from chuva import chuva

def lista_arquivo(lista, dados):

    leitor = open(lista, "r", encoding="utf-8")

    for linha in leitor:

        linha = linha.strip()
        dados_linha = linha.split(",")

        ano = int(dados_linha[0])
        mes = dados_linha[1]
        temperatura = dados_linha[2]
        precipitacao = dados_linha[3]

        obj = chuva(ano, mes, temperatura, precipitacao)
        
        if chuva not in lista:
            lista.append(obj)

    leitor.close()


    
