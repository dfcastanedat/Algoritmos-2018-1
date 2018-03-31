#include <iostream>
#include <ctime>
#include <iostream>
#include <math.h>
#define d 200
using std::cout;
using std::cin;
using std::endl;

int main() {
	int n, i, j, k, a[d][d], b[d][d], c[d][d];
	cout << "MATRIZ A." << endl; // Introduce los elementos de la matriz A 
	for (i = 0; i < d; i++) {
		for (j = 0; j < d; j++) {
			a[i][j]=1;
		}
	}
	cout << endl;
	cout << "MATRIZ B." << endl; // Introduce los elementos de la matriz B
	for (i = 0; i < d; i++) {
		for (j = 0; j < d; j++) {
			b[i][j]=2;
		}
	}	
	int t0 = 0, t1 = 0;
	double sum = 0;
	int xd = 10;
	for (n = 0; n < 10; n++) {
		t0 = clock();
		for (i = 0; i < d; i++) { /* Realiza el producto de matrices y guarda el resultado en una tercera matriz*/
			for (j = 0; j < d; j++) {
				c[i][j] = 0;
				for (k = 0; k < d; k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		t1 = clock();
		double aux = ((double)(t1 - t0) / CLOCKS_PER_SEC) / (2 * pow(n, 3.0));
		sum = sum + aux;
		cout << sum / xd;
	}
	system("PAUSE");
	return 0;
}