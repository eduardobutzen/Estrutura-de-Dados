#include <iostream>
#include <string>
#include "utilidades.h"

using namespace std;

int main() {

    string vetorNomes[TAMANHO];
    int totalNomesInseridos = 0;

    inicializar(vetorNomes);

    totalNomesInseridos = inserir("Maria", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("Joao", vetorNomes, totalNomesInseridos);
    totalNomesInseridos = inserir("Ana", vetorNomes, totalNomesInseridos);

    exibir(vetorNomes);

    string nome;
    cout << "\nDigite um nome: ";
    getline(cin, nome);

    int posicao = ondeesta(nome, vetorNomes);
    if (posicao != -1) {
        cout << "Seu nome esta na posicao: " << posicao << "deseja deletar ele da lista? (s/n)" << endl;
        char resposta;
        cin >> resposta;
        if (resposta == 's' || resposta == 'S') {
            totalNomesInseridos = remover(nome, vetorNomes, totalNomesInseridos);
        }
    } else {
        cout << "Nome nao encontrado, deseja inserir? (s/n)" << endl;
        char resposta;
        cin >> resposta;
        if (resposta == 's' || resposta == 'S') {
            totalNomesInseridos = inserir(nome, vetorNomes, totalNomesInseridos);
        }
    }

/*     totalNomesInseridos = remover(nome, vetorNomes, totalNomesInseridos);
    cout << "Total agora: " << totalNomesInseridos << endl; */

    exibir(vetorNomes);

    return 0;
}