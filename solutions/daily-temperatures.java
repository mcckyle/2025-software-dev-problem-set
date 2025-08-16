class Solution {
    public int[] dailyTemperatures(int[] temperatures)
    {
        int [] answer = new int [temperatures.length];
        Stack<int[]> myStack = new Stack<>();
        //int numDays;
        //int currentTemp;

        for(int i = 0; i < temperatures.length; i ++)
        {
            int temp = temperatures[i];

            while( (!myStack.isEmpty()) && (temp > myStack.peek()[0]) )
            {
                int [] pair = myStack.pop();
                answer[pair[1]] = i - pair[1];
            }
            myStack.push(new int[]{temp, i});
            // numDays = 1;
            // //currentTemp = temperatures[i];
            // int j = i + 1;

            // while(j < temperatures.length)
            // {
            //     if(temperatures[j] > temperatures[i])
            //     {
            //         break;
            //     }
            //     j ++;
            //     numDays ++;
            // }

            // numDays = (j == temperatures.length) ? 0 : numDays;
            // answer[i] = numDays;


            // // while(numDays + i < temperatures.length)
            // // {
            // //     //Greater temp on the next day.
            // //     if(temperatures[i + numDays] > currentTemp)
            // //     {
            // //         answer[i] = numDays;
            // //         break;
            // //     }
            // //     //End of temps array, set to 0 and start from the next ith element.
            // //     else if(numDays + i == temperatures.length)
            // //     {
            // //         numDays = 0;
            // //         answer[i] = numDays;
            // //         break;
            // //     }
            // //     //Colder temp on next day, continue.
            // //     else
            // //     {
            // //         numDays ++;

            // //         if(numDays + i == temperatures.length)
            // //         {
            // //             numDays = 0;
            // //             answer[i] = numDays;
            // //             break;
            // //         }
            // //     }
            // // }
        }

        //answer[.add(0);]

        // int [] result = new int[answer.size()];
        // for(int i = 0; i < answer.size(); i ++)
        // {
        //     result[i] = answer.get(i);
        // }


        //return result;
        //return answer.toArray(new int[answer.size()]);
        return answer;
    }
}
