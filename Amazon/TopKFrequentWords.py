from collections import defaultdict
class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        soln=[]
        freq={}
        def find_key(freq,k):
            for key, val in freq.items():
                # print("key",key)
                # print("val",val)
                if val == k:
                    return key
        for i in words:
            if i in freq.keys():
                freq[i]+=1
            else:
                freq[i]=1
        freq=dict(sorted(freq.items(), key=lambda item: item[0]))
        # print(freq)
        for _ in range(k):
            temp=max(freq.values())
            ind=find_key(freq,temp)
            soln.append(ind)
            del freq[ind]
        return soln
