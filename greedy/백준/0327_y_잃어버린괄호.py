#식: 0~9, + , - , 처음/마지막 => 숫자, 연속 연산자 X, 5자리보다 많은 연속숫자 X, 수는 0으로 시작 가능, 식의길이 <= 50
#괄호를 적당히 쳐서 식의 값을 최소로

#나의 생각
#최소가 되려면? -일 때는 두 수의 값이 차이가 적게 나야하고 +일 때는 두 수의 값이 차이가 많이 나야함
#악 근데 음수도 가능하군,,
#시간 오류만 안 뜬다면 다 저장해서 비교해볼까
# ex. 55-50+40 => [5,-10,45] => -는 따로 또 구해야하나..=> -가 나오면 끊고 봐야할듯? => -뒤에서 다음 -까지 끊는 방식으로 구현?

expression = input("")

parts = expression.split('-')

result = []

for part in parts:
    numbers = part.split('+')
    if len(numbers) == 1:
        result.append(int(numbers[0]))
    else:
        initial_value = int(numbers[0])
        for number in numbers[1:]:
            initial_value += int(number) 
        result.append(initial_value)
final_result = result[0]

for value in result[1:]:
    final_result -= value

print(final_result)