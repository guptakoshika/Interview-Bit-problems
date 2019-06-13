#include<iostream>
using namespace std;
int main()
 {
	int t ;
	cin >> t;
	while(t--)
	{
	    int n ;
	    cin >> n;
	    int s = n*(n+1)/2;
	    for(int i =0 ; i< n-1 ; i++)
	    {
	        int a;
	        cin >>a;
	        s = s-a;
	    }
	    cout << s << endl;
	}
	return 0;
}