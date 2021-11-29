#include <stdio.h>

int a[100000];
long long int t;
unsigned long long int s[100000], sum[100000];
long long int binary(long long int n) {
  long long int low = 0, high = t, mid = 0;
  while (low <= high) {
    mid = (low + high) / 2;
    if (sum[mid] >= n && sum[mid - 1] < n)
      return mid;
    if (sum[mid] < n)
      low = mid + 1;
    else if (sum[mid] > n)
      high = mid - 1;
  }
  return -2;
}
int main() {
  long long int ans;
  long long int i, q, j;
  scanf("%lld", & t);

  for (j = 0; j < t; j++) {
    scanf("%d", & a[j]);
    if (j == 0) {
      sum[j] = a[j];
      continue;
    }
    sum[j] = a[j] + sum[j - 1];
  }

  scanf("%lld", & q);
  for (i = 0; i < q; i++)
    scanf("%lld", & s[i]);
  for (i = 0; i < q; i++) {
    if (s[i] > sum[t - 1]) {
      printf("-1\n");
      continue;
    }
    ans = binary(s[i]);
    printf("%lld\n", ans + 1);
  }

  return 0;
}
