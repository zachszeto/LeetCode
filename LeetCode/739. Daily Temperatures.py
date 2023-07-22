class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        result = [0] * len(temperatures)

        for i in range(len(temperatures)):
            if not stack or temperatures[i] <= stack[-1][0]:
                stack.append((temperatures[i], i))
                continue

            while stack and temperatures[i] > stack[-1][0]:
               temp, index = stack.pop()
               

               result[index] = abs(i - index)

            stack.append((temperatures[i], i))

        return result