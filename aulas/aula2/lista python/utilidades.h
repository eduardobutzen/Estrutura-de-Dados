#ifndef UTILIDADES_H
#define UTILIDADES_H

#include <iostream>
#include <string>

#define TAMANHO 10

using namespace std;

void inicializar(string vetor[]) {

    for (int i = 0; i < TAMANHO; i++) {
        vetor[i] = "vazio";
    }

}

int inserir(string nome, string vetor[], int total) {

    if (total == TAMANHO) {
        cout << "Lista cheia!" << endl;
        return total;
    }

    for (int i = 0; i < TAMANHO; i++) {

        if (vetor[i] == "vazio") {
            vetor[i] = nome;
            total++;
            break;
        }

    }

    return total;
}

void exibir(string vetor[]) {

    cout << "\nLista de nomes:\n";

    for (int i = 0; i < TAMANHO; i++) {

        if (vetor[i] != "vazio") {
            cout << vetor[i] << endl;
        }

    }
}

int ondeesta(string nome, string vetor[]) {

    for (int i = 0; i < TAMANHO; i++) {

        if (vetor[i] == nome) {
            return i;
        }

    }

    return -1;
}

int remover(string nome, string vetor[], int total) {

    int posicao = ondeesta(nome, vetor);

    if (posicao != -1) {
        vetor[posicao] = "vazio";
        total--;
        cout << "Nome removido com sucesso!" << endl;
    }
    else {
        cout << "Nome nao encontrado." << endl;
    }

    return total;
}

#endif