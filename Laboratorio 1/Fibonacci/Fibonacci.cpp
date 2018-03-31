#include <conio.h>
#include <iostream>

using namespace std;
//Short
short Fibo_short(short n) {
	short x = 0, y = 1, z = 1;
	for (int i = 1; i < n; i++) {
		x = y;
		y = z;
		z = x + y;
	}
	return x;
}
//Int
int Fibo_int(int n) {
	int x = 0, y = 1, z = 1;
	for (int i = 1; i < n; i++) {
		x = y;
		y = z;
		z = x + y;
	}
	return x;
}
//Long
long Fibo_long(long n) {
	long x = 0, y = 1, z = 1;
	for (int i = 1; i < n; i++) {
		x = y;
		y = z;
		z = x + y;
	}
	return x;
}
//LongLong
long long Fibo_long_long(long long n) {
	long long x = 0, y = 1, z = 1;
	for (int i = 1; i < n; i++) {
		x = y;
		y = z;
		z = x + y;
	}
	return x;
}
int main() {
	short n1 = 25; //Sin overflow hasta n=24
	int n2 = 46; //Sin overflow hasta n=46
	long n3 = 92; //Sin overflow hasta n=92
	long long n4 = 92; //Sin overflow hasta n=92
	cout << Fibo_short(n1) << endl;
	cout << Fibo_int(n2) << endl;
	cout << Fibo_long(n3) << endl;
	cout << Fibo_long_long(n4) << endl;
	system("pause");
	return 0;
}