package c2stage_20220421.ccc148analysis;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc148analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-20  ����һ
 */
public class ccc001 {
    // @Override
    // public PubRuleMergeDto getPubRuleDetail(PubRuleMergeDto ruleMergeDto) throws Exception {
    //     String ruleId = ruleMergeDto.getRuleId();
    //     if (EmptyUtil.isEmpty(ruleId)) {
    //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "��������id����Ϊ��");
    //     }
    //     //�����ѯ,�����������Ϊ�վ��ٲ�ѯһ������
    //     if (EmptyUtil.isEmpty(ruleMergeDto.getBusinessScenarioType())) {
    //-------------------------------------------------------------------------------------------------
    // ʹ�ó־ò��װ�õķ�����
    // ʹ��ָ����dto���ͣ�ָ���ı�����ͣ������ȡ��id��
    // ��λ��Ӧ��dto����
    // efPersistenceService.getById(PubRuleScene2Dto .class, PubRuleScene2Model.class, ruleId);
    //-------------------------------------------------------------------------------------------------
    // ͬ���ģ����ݶ�Ӧ����������ѯdto
    // efPersistenceService.query(PubRuleScene2CondDto.class, PubRuleScene2CondModel.class, condition);
    //-------------------------------------------------------------------------------------------------
    //         PubRuleScene2Dto ruleDto = efPersistenceService.getById(PubRuleScene2Dto.class, PubRuleScene2Model.class, ruleId);
    //         if (EmptyUtil.isNotEmpty(ruleDto)) {
    //             ruleMergeDto.setBusinessScenarioName(ruleDto.getBusinessScenarioName());
    //             ruleMergeDto.setBusinessScenarioType(ruleDto.getBusinessScenarioType());
    //             ruleMergeDto.setSceneExpr(ruleDto.getSceneExpr());
    //         }
    //     }
    //-------------------------------------------------------------------------------------------------
    //     //�����б��ѯ
    //     PubRuleScene2CondDto condition = new PubRuleScene2CondDto();
    //     condition.setBusinessScenarioId(ruleId);
    //     List<PubRuleScene2CondDto> condList = efPersistenceService.query(PubRuleScene2CondDto.class, PubRuleScene2CondModel.class, condition);
    //     ruleMergeDto.setCondList(condList);

    //     //����б��ѯ
    //     PubRuleScene2ResultDto resultConditon = new PubRuleScene2ResultDto();
    //     resultConditon.setBusinessScenarioId(ruleId);
    //     List<PubRuleScene2ResultDto> resultList = efPersistenceService.query(PubRuleScene2ResultDto.class, PubRuleScene2ResultModel.class, resultConditon);
    //     ruleMergeDto.setResultList(resultList);
    //-------------------------------------------------------------------------------------------------
    // ���ܹ�����Σ����շ���һ��dto�Ϳ���
    //     return ruleMergeDto;
    // }
}
