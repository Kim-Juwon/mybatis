package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TestMapper;

import java.util.HashMap;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    public Map<String, String> test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("getNowTime()", testMapper.getNowTime());
        map.put("getTime()", testMapper.getTime());

        return map;
    }
}
