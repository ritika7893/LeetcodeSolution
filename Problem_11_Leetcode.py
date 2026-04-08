  l=0
        max_area=0
        r=len(height)-1
        while l<r:
            base=r-l
            hei=min(height[l],height[r])
            area=base*hei
            print(area)
            max_area=max(max_area,area)
            if(height[l]>height[r]):
                l+=1
            else:
                r-=1
        return max_area
            
