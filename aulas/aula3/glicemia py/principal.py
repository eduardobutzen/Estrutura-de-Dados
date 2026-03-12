from minhas_funcoes import popular_lista_arquivo, imprimir_lista, calcular_media, calcular_mediana

lista = []
nome_base = "d:/faculdade/Estrutura-de-Dados/aulas/aula3/glicemia py/dados.csv"

popular_lista_arquivo(lista, nome_base)

print("Lista de glicemias:")
imprimir_lista(lista)

media = calcular_media(lista)
mediana = calcular_mediana(lista)

print()
print(f"Média: {media}")
print(f"Mediana: {mediana}")
print(f"Total de dados da base: {len(lista)}")