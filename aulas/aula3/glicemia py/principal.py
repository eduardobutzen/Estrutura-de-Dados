from glicemia import glicemia
from minhas_funcoes import popular_lista_arquivo, exibindo_lista, calcular_media

lista = []
nome_base = "dados.csv"

popular_lista_arquivo(lista, nome_base)
exibindo_lista(lista) 

media = calcular_media(lista)
print(f"media: {media}")
print(f"total de dados da base: {len(lista)}")


