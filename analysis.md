# analysis.md

## ERROR мөрүүд
grep "ERROR" logs/app.log

## WARN мөрүүд realtime
tail -f logs/app.log | grep "WARN"

## Level count
awk '{print $3}' logs/app.log | sort | uniq -c

## Яагаад tail -f сайн бэ?
tail -f нь шинээр орж ирж буй логийг шууд харуулдаг.
Debug хийх үед маш хэрэгтэй.
