package com.zlkcxd.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PersonInfo implements Serializable {
    /**
     * 主键id自增长 -- person_info.id
     * 
     */
    private Long id;

    /**
     * 创建时间 -- person_info.created_time
     * 
     */
    private Date createdTime;

    /**
     * 修改时间 -- person_info.updated_time
     * 
     */
    private Date updatedTime;

    /**
     * 个人名称（客户名称） -- person_info.person_name
     * 
     */
    private String personName;

    /**
     * 手机号码1 -- person_info.mobile_no1
     * 
     */
    private String mobileNo1;

    /**
     * 手机号2 -- person_info.mobile_no2
     * 
     */
    private String mobileNo2;

    /**
     * 出生日期 -- person_info.date_of_birth
     * 
     */
    private Date dateOfBirth;

    /**
     * 性别 -- person_info.sex
     * 
     */
    private String sex;

    /**
     * 年龄 -- person_info.age
     * 
     */
    private Integer age;

    /**
     * 学历 -- person_info.education
     * 
     */
    private String education;

    /**
     * 个人年收入(万元) -- person_info.personal_year_income
     * 
     */
    private String personalYearIncome;

    /**
     * 个人月收入(万元) -- person_info.person_month_income
     * 
     */
    private String personMonthIncome;

    /**
     * 有无子女 -- person_info.has_children
     * 
     */
    private String hasChildren;

    /**
     * 民族：
汉族、壮族、白族、苗族、蒙古族、维吾尔族、回族、藏族（默认汉族，可修改） -- person_info.national
     * 
     */
    private String national;

    /**
     * 婚姻状况：
已婚、未婚、丧偶、离婚 -- person_info.martial_status
     * 
     */
    private String martialStatus;

    /**
     * 客户号，关联customer_info.id字段 -- person_info.customer_id
     * 
     */
    private Long customerId;

    /**
     * 联系电话 -- person_info.contact_phone
     * 
     */
    private String contactPhone;

    /**
     * 常居住地址 -- person_info.often_live_address
     * 
     */
    private String oftenLiveAddress;

    /**
     * 单位名称 -- person_info.enterprise_name
     * 
     */
    private String enterpriseName;

    /**
     * 单位所属行业 -- person_info.enterprise_industry
     * 
     */
    private String enterpriseIndustry;

    /**
     * 单位地址-省 -- person_info.enterprise_address_province
     * 
     */
    private String enterpriseAddressProvince;

    /**
     * 单位性质  在字典表中维护（此字段不使用） -- person_info.enterprise_nature
     * 
     */
    private Integer enterpriseNature;

    /**
     * 单位地址-市 -- person_info.enterprise_address_city
     * 
     */
    private String enterpriseAddressCity;

    /**
     * 单位地址-县（区） -- person_info.enterprise_address_country
     * 
     */
    private String enterpriseAddressCountry;

    /**
     * 单位性质 -- person_info.enterprise_proterties
     * 
     */
    private String enterpriseProterties;

    /**
     * 单位地址-详细地址 -- person_info.enterprise_address_detail
     * 
     */
    private String enterpriseAddressDetail;

    /**
     * 单位电话-区号 -- person_info.company_tel_areacode
     * 
     */
    private String companyTelAreacode;

    /**
     * 公司电话-座机号 -- person_info.company_tel_landline
     * 
     */
    private String companyTelLandline;

    /**
     * 开始工作日期 -- person_info.start_work_date
     * 
     */
    private Date startWorkDate;

    /**
     * 现单位工作年限 -- person_info.now_company_work_age
     * 
     */
    private Integer nowCompanyWorkAge;

    /**
     * 从事行业 -- person_info.occupation_type
     * 
     */
    private String occupationType;

    /**
     * 个人职位 -- person_info.position
     * 
     */
    private String position;

    /**
     * 个人职称：\高级\中级\初级\无\未知 -- person_info.professional_title
     * 
     */
    private String professionalTitle;

    /**
     * 居住状况 -- person_info.living_condition
     * 
     */
    private String livingCondition;

    /**
     * 住宅性质：自有住房（无贷款）、贷款购房、与亲属合住、租房、集体宿舍 -- person_info.residential_properties
     * 
     */
    private String residentialProperties;

    /**
     * 是否提供房产证 -- person_info.is_house_certificate
     * 
     */
    private String isHouseCertificate;

    /**
     * 房产面积 -- person_info.house_area
     * 
     */
    private String houseArea;

    /**
     * 房产价格（万元） -- person_info.house_price
     * 
     */
    private BigDecimal housePrice;

    /**
     * 是否有车 -- person_info.is_own_car
     * 
     */
    private String isOwnCar;

    /**
     * 车子品牌 -- person_info.car_brand
     * 
     */
    private String carBrand;

    /**
     * 是否提供行驶证 -- person_info.is_drive_license
     * 
     */
    private String isDriveLicense;

    /**
     * 车子价格 -- person_info.car_price
     * 
     */
    private BigDecimal carPrice;

    /**
     * 车牌 -- person_info.car_number
     * 
     */
    private String carNumber;

    /**
     * 车贷结清情况 -- person_info.car_mortgage
     * 
     */
    private String carMortgage;

    /**
     * 房贷结清情况 -- person_info.house_mortgage
     * 
     */
    private String houseMortgage;

    /**
     * 购车情况，对应外部系统购车情况 -- person_info.car_situation
     * 
     */
    private String carSituation;

    /**
     * 过去一年的日均资产 -- person_info.daily_assets
     * 
     */
    private String dailyAssets;

    /**
     * 当天资产 -- person_info.day_assets
     * 
     */
    private String dayAssets;

    /**
     * 过去一年有资产的交易日天数 -- person_info.business_days
     * 
     */
    private String businessDays;

    /**
     * 一致性校验 ： 0：一致 1：不一致 2:未效验 -- person_info.identity_check
     * 
     */
    private String identityCheck;

    /**
     * 住宅情况,对应外部系统住宅情况 -- person_info.house_situation
     * 
     */
    private String houseSituation;

    /**
     * 房产地址 省 -- person_info.house_address_province
     * 
     */
    private String houseAddressProvince;

    /**
     * 房产地址 市 -- person_info.house_address_city
     * 
     */
    private String houseAddressCity;

    /**
     * 房产地址 县 -- person_info.house_address_country
     * 
     */
    private String houseAddressCountry;

    /**
     * 房产地址 详情 -- person_info.house_address_detail
     * 
     */
    private String houseAddressDetail;

    /**
     * 身份证有效期起始日 -- person_info.cert_validity_start
     * 
     */
    private Date certValidityStart;

    /**
     * 身份证有效期结束日 -- person_info.cert_validity_end
     * 
     */
    private Date certValidityEnd;

    /**
     * 职业 -- person_info.professional
     * 
     */
    private String professional;

    /**
     * 是否长期有效 1- 是 0- 否 -- person_info.is_effective
     * 
     */
    private Integer isEffective;

    /**
     * 芝麻分 -- person_info.zhima_score
     * 
     */
    private Integer zhimaScore;

    /**
     * person_info表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 person_info.id的get方法 
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 数据字段 person_info.id的set方法
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 数据字段 person_info.created_time的get方法 
     * 
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 数据字段 person_info.created_time的set方法
     * 
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 数据字段 person_info.updated_time的get方法 
     * 
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 数据字段 person_info.updated_time的set方法
     * 
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 数据字段 person_info.person_name的get方法 
     * 
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 数据字段 person_info.person_name的set方法
     * 
     */
    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    /**
     * 数据字段 person_info.mobile_no1的get方法 
     * 
     */
    public String getMobileNo1() {
        return mobileNo1;
    }

    /**
     * 数据字段 person_info.mobile_no1的set方法
     * 
     */
    public void setMobileNo1(String mobileNo1) {
        this.mobileNo1 = mobileNo1 == null ? null : mobileNo1.trim();
    }

    /**
     * 数据字段 person_info.mobile_no2的get方法 
     * 
     */
    public String getMobileNo2() {
        return mobileNo2;
    }

    /**
     * 数据字段 person_info.mobile_no2的set方法
     * 
     */
    public void setMobileNo2(String mobileNo2) {
        this.mobileNo2 = mobileNo2 == null ? null : mobileNo2.trim();
    }

    /**
     * 数据字段 person_info.date_of_birth的get方法 
     * 
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * 数据字段 person_info.date_of_birth的set方法
     * 
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * 数据字段 person_info.sex的get方法 
     * 
     */
    public String getSex() {
        return sex;
    }

    /**
     * 数据字段 person_info.sex的set方法
     * 
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 数据字段 person_info.age的get方法 
     * 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 数据字段 person_info.age的set方法
     * 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 数据字段 person_info.education的get方法 
     * 
     */
    public String getEducation() {
        return education;
    }

    /**
     * 数据字段 person_info.education的set方法
     * 
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * 数据字段 person_info.personal_year_income的get方法 
     * 
     */
    public String getPersonalYearIncome() {
        return personalYearIncome;
    }

    /**
     * 数据字段 person_info.personal_year_income的set方法
     * 
     */
    public void setPersonalYearIncome(String personalYearIncome) {
        this.personalYearIncome = personalYearIncome == null ? null : personalYearIncome.trim();
    }

    /**
     * 数据字段 person_info.person_month_income的get方法 
     * 
     */
    public String getPersonMonthIncome() {
        return personMonthIncome;
    }

    /**
     * 数据字段 person_info.person_month_income的set方法
     * 
     */
    public void setPersonMonthIncome(String personMonthIncome) {
        this.personMonthIncome = personMonthIncome == null ? null : personMonthIncome.trim();
    }

    /**
     * 数据字段 person_info.has_children的get方法 
     * 
     */
    public String getHasChildren() {
        return hasChildren;
    }

    /**
     * 数据字段 person_info.has_children的set方法
     * 
     */
    public void setHasChildren(String hasChildren) {
        this.hasChildren = hasChildren == null ? null : hasChildren.trim();
    }

    /**
     * 数据字段 person_info.national的get方法 
     * 
     */
    public String getNational() {
        return national;
    }

    /**
     * 数据字段 person_info.national的set方法
     * 
     */
    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    /**
     * 数据字段 person_info.martial_status的get方法 
     * 
     */
    public String getMartialStatus() {
        return martialStatus;
    }

    /**
     * 数据字段 person_info.martial_status的set方法
     * 
     */
    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus == null ? null : martialStatus.trim();
    }

    /**
     * 数据字段 person_info.customer_id的get方法 
     * 
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 数据字段 person_info.customer_id的set方法
     * 
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 数据字段 person_info.contact_phone的get方法 
     * 
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 数据字段 person_info.contact_phone的set方法
     * 
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * 数据字段 person_info.often_live_address的get方法 
     * 
     */
    public String getOftenLiveAddress() {
        return oftenLiveAddress;
    }

    /**
     * 数据字段 person_info.often_live_address的set方法
     * 
     */
    public void setOftenLiveAddress(String oftenLiveAddress) {
        this.oftenLiveAddress = oftenLiveAddress == null ? null : oftenLiveAddress.trim();
    }

    /**
     * 数据字段 person_info.enterprise_name的get方法 
     * 
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * 数据字段 person_info.enterprise_name的set方法
     * 
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * 数据字段 person_info.enterprise_industry的get方法 
     * 
     */
    public String getEnterpriseIndustry() {
        return enterpriseIndustry;
    }

    /**
     * 数据字段 person_info.enterprise_industry的set方法
     * 
     */
    public void setEnterpriseIndustry(String enterpriseIndustry) {
        this.enterpriseIndustry = enterpriseIndustry == null ? null : enterpriseIndustry.trim();
    }

    /**
     * 数据字段 person_info.enterprise_address_province的get方法 
     * 
     */
    public String getEnterpriseAddressProvince() {
        return enterpriseAddressProvince;
    }

    /**
     * 数据字段 person_info.enterprise_address_province的set方法
     * 
     */
    public void setEnterpriseAddressProvince(String enterpriseAddressProvince) {
        this.enterpriseAddressProvince = enterpriseAddressProvince == null ? null : enterpriseAddressProvince.trim();
    }

    /**
     * 数据字段 person_info.enterprise_nature的get方法 
     * 
     */
    public Integer getEnterpriseNature() {
        return enterpriseNature;
    }

    /**
     * 数据字段 person_info.enterprise_nature的set方法
     * 
     */
    public void setEnterpriseNature(Integer enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    /**
     * 数据字段 person_info.enterprise_address_city的get方法 
     * 
     */
    public String getEnterpriseAddressCity() {
        return enterpriseAddressCity;
    }

    /**
     * 数据字段 person_info.enterprise_address_city的set方法
     * 
     */
    public void setEnterpriseAddressCity(String enterpriseAddressCity) {
        this.enterpriseAddressCity = enterpriseAddressCity == null ? null : enterpriseAddressCity.trim();
    }

    /**
     * 数据字段 person_info.enterprise_address_country的get方法 
     * 
     */
    public String getEnterpriseAddressCountry() {
        return enterpriseAddressCountry;
    }

    /**
     * 数据字段 person_info.enterprise_address_country的set方法
     * 
     */
    public void setEnterpriseAddressCountry(String enterpriseAddressCountry) {
        this.enterpriseAddressCountry = enterpriseAddressCountry == null ? null : enterpriseAddressCountry.trim();
    }

    /**
     * 数据字段 person_info.enterprise_proterties的get方法 
     * 
     */
    public String getEnterpriseProterties() {
        return enterpriseProterties;
    }

    /**
     * 数据字段 person_info.enterprise_proterties的set方法
     * 
     */
    public void setEnterpriseProterties(String enterpriseProterties) {
        this.enterpriseProterties = enterpriseProterties == null ? null : enterpriseProterties.trim();
    }

    /**
     * 数据字段 person_info.enterprise_address_detail的get方法 
     * 
     */
    public String getEnterpriseAddressDetail() {
        return enterpriseAddressDetail;
    }

    /**
     * 数据字段 person_info.enterprise_address_detail的set方法
     * 
     */
    public void setEnterpriseAddressDetail(String enterpriseAddressDetail) {
        this.enterpriseAddressDetail = enterpriseAddressDetail == null ? null : enterpriseAddressDetail.trim();
    }

    /**
     * 数据字段 person_info.company_tel_areacode的get方法 
     * 
     */
    public String getCompanyTelAreacode() {
        return companyTelAreacode;
    }

    /**
     * 数据字段 person_info.company_tel_areacode的set方法
     * 
     */
    public void setCompanyTelAreacode(String companyTelAreacode) {
        this.companyTelAreacode = companyTelAreacode == null ? null : companyTelAreacode.trim();
    }

    /**
     * 数据字段 person_info.company_tel_landline的get方法 
     * 
     */
    public String getCompanyTelLandline() {
        return companyTelLandline;
    }

    /**
     * 数据字段 person_info.company_tel_landline的set方法
     * 
     */
    public void setCompanyTelLandline(String companyTelLandline) {
        this.companyTelLandline = companyTelLandline == null ? null : companyTelLandline.trim();
    }

    /**
     * 数据字段 person_info.start_work_date的get方法 
     * 
     */
    public Date getStartWorkDate() {
        return startWorkDate;
    }

    /**
     * 数据字段 person_info.start_work_date的set方法
     * 
     */
    public void setStartWorkDate(Date startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    /**
     * 数据字段 person_info.now_company_work_age的get方法 
     * 
     */
    public Integer getNowCompanyWorkAge() {
        return nowCompanyWorkAge;
    }

    /**
     * 数据字段 person_info.now_company_work_age的set方法
     * 
     */
    public void setNowCompanyWorkAge(Integer nowCompanyWorkAge) {
        this.nowCompanyWorkAge = nowCompanyWorkAge;
    }

    /**
     * 数据字段 person_info.occupation_type的get方法 
     * 
     */
    public String getOccupationType() {
        return occupationType;
    }

    /**
     * 数据字段 person_info.occupation_type的set方法
     * 
     */
    public void setOccupationType(String occupationType) {
        this.occupationType = occupationType == null ? null : occupationType.trim();
    }

    /**
     * 数据字段 person_info.position的get方法 
     * 
     */
    public String getPosition() {
        return position;
    }

    /**
     * 数据字段 person_info.position的set方法
     * 
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * 数据字段 person_info.professional_title的get方法 
     * 
     */
    public String getProfessionalTitle() {
        return professionalTitle;
    }

    /**
     * 数据字段 person_info.professional_title的set方法
     * 
     */
    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle == null ? null : professionalTitle.trim();
    }

    /**
     * 数据字段 person_info.living_condition的get方法 
     * 
     */
    public String getLivingCondition() {
        return livingCondition;
    }

    /**
     * 数据字段 person_info.living_condition的set方法
     * 
     */
    public void setLivingCondition(String livingCondition) {
        this.livingCondition = livingCondition == null ? null : livingCondition.trim();
    }

    /**
     * 数据字段 person_info.residential_properties的get方法 
     * 
     */
    public String getResidentialProperties() {
        return residentialProperties;
    }

    /**
     * 数据字段 person_info.residential_properties的set方法
     * 
     */
    public void setResidentialProperties(String residentialProperties) {
        this.residentialProperties = residentialProperties == null ? null : residentialProperties.trim();
    }

    /**
     * 数据字段 person_info.is_house_certificate的get方法 
     * 
     */
    public String getIsHouseCertificate() {
        return isHouseCertificate;
    }

    /**
     * 数据字段 person_info.is_house_certificate的set方法
     * 
     */
    public void setIsHouseCertificate(String isHouseCertificate) {
        this.isHouseCertificate = isHouseCertificate == null ? null : isHouseCertificate.trim();
    }

    /**
     * 数据字段 person_info.house_area的get方法 
     * 
     */
    public String getHouseArea() {
        return houseArea;
    }

    /**
     * 数据字段 person_info.house_area的set方法
     * 
     */
    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea == null ? null : houseArea.trim();
    }

    /**
     * 数据字段 person_info.house_price的get方法 
     * 
     */
    public BigDecimal getHousePrice() {
        return housePrice;
    }

    /**
     * 数据字段 person_info.house_price的set方法
     * 
     */
    public void setHousePrice(BigDecimal housePrice) {
        this.housePrice = housePrice;
    }

    /**
     * 数据字段 person_info.is_own_car的get方法 
     * 
     */
    public String getIsOwnCar() {
        return isOwnCar;
    }

    /**
     * 数据字段 person_info.is_own_car的set方法
     * 
     */
    public void setIsOwnCar(String isOwnCar) {
        this.isOwnCar = isOwnCar == null ? null : isOwnCar.trim();
    }

    /**
     * 数据字段 person_info.car_brand的get方法 
     * 
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 数据字段 person_info.car_brand的set方法
     * 
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    /**
     * 数据字段 person_info.is_drive_license的get方法 
     * 
     */
    public String getIsDriveLicense() {
        return isDriveLicense;
    }

    /**
     * 数据字段 person_info.is_drive_license的set方法
     * 
     */
    public void setIsDriveLicense(String isDriveLicense) {
        this.isDriveLicense = isDriveLicense == null ? null : isDriveLicense.trim();
    }

    /**
     * 数据字段 person_info.car_price的get方法 
     * 
     */
    public BigDecimal getCarPrice() {
        return carPrice;
    }

    /**
     * 数据字段 person_info.car_price的set方法
     * 
     */
    public void setCarPrice(BigDecimal carPrice) {
        this.carPrice = carPrice;
    }

    /**
     * 数据字段 person_info.car_number的get方法 
     * 
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 数据字段 person_info.car_number的set方法
     * 
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * 数据字段 person_info.car_mortgage的get方法 
     * 
     */
    public String getCarMortgage() {
        return carMortgage;
    }

    /**
     * 数据字段 person_info.car_mortgage的set方法
     * 
     */
    public void setCarMortgage(String carMortgage) {
        this.carMortgage = carMortgage == null ? null : carMortgage.trim();
    }

    /**
     * 数据字段 person_info.house_mortgage的get方法 
     * 
     */
    public String getHouseMortgage() {
        return houseMortgage;
    }

    /**
     * 数据字段 person_info.house_mortgage的set方法
     * 
     */
    public void setHouseMortgage(String houseMortgage) {
        this.houseMortgage = houseMortgage == null ? null : houseMortgage.trim();
    }

    /**
     * 数据字段 person_info.car_situation的get方法 
     * 
     */
    public String getCarSituation() {
        return carSituation;
    }

    /**
     * 数据字段 person_info.car_situation的set方法
     * 
     */
    public void setCarSituation(String carSituation) {
        this.carSituation = carSituation == null ? null : carSituation.trim();
    }

    /**
     * 数据字段 person_info.daily_assets的get方法 
     * 
     */
    public String getDailyAssets() {
        return dailyAssets;
    }

    /**
     * 数据字段 person_info.daily_assets的set方法
     * 
     */
    public void setDailyAssets(String dailyAssets) {
        this.dailyAssets = dailyAssets == null ? null : dailyAssets.trim();
    }

    /**
     * 数据字段 person_info.day_assets的get方法 
     * 
     */
    public String getDayAssets() {
        return dayAssets;
    }

    /**
     * 数据字段 person_info.day_assets的set方法
     * 
     */
    public void setDayAssets(String dayAssets) {
        this.dayAssets = dayAssets == null ? null : dayAssets.trim();
    }

    /**
     * 数据字段 person_info.business_days的get方法 
     * 
     */
    public String getBusinessDays() {
        return businessDays;
    }

    /**
     * 数据字段 person_info.business_days的set方法
     * 
     */
    public void setBusinessDays(String businessDays) {
        this.businessDays = businessDays == null ? null : businessDays.trim();
    }

    /**
     * 数据字段 person_info.identity_check的get方法 
     * 
     */
    public String getIdentityCheck() {
        return identityCheck;
    }

    /**
     * 数据字段 person_info.identity_check的set方法
     * 
     */
    public void setIdentityCheck(String identityCheck) {
        this.identityCheck = identityCheck == null ? null : identityCheck.trim();
    }

    /**
     * 数据字段 person_info.house_situation的get方法 
     * 
     */
    public String getHouseSituation() {
        return houseSituation;
    }

    /**
     * 数据字段 person_info.house_situation的set方法
     * 
     */
    public void setHouseSituation(String houseSituation) {
        this.houseSituation = houseSituation == null ? null : houseSituation.trim();
    }

    /**
     * 数据字段 person_info.house_address_province的get方法 
     * 
     */
    public String getHouseAddressProvince() {
        return houseAddressProvince;
    }

    /**
     * 数据字段 person_info.house_address_province的set方法
     * 
     */
    public void setHouseAddressProvince(String houseAddressProvince) {
        this.houseAddressProvince = houseAddressProvince == null ? null : houseAddressProvince.trim();
    }

    /**
     * 数据字段 person_info.house_address_city的get方法 
     * 
     */
    public String getHouseAddressCity() {
        return houseAddressCity;
    }

    /**
     * 数据字段 person_info.house_address_city的set方法
     * 
     */
    public void setHouseAddressCity(String houseAddressCity) {
        this.houseAddressCity = houseAddressCity == null ? null : houseAddressCity.trim();
    }

    /**
     * 数据字段 person_info.house_address_country的get方法 
     * 
     */
    public String getHouseAddressCountry() {
        return houseAddressCountry;
    }

    /**
     * 数据字段 person_info.house_address_country的set方法
     * 
     */
    public void setHouseAddressCountry(String houseAddressCountry) {
        this.houseAddressCountry = houseAddressCountry == null ? null : houseAddressCountry.trim();
    }

    /**
     * 数据字段 person_info.house_address_detail的get方法 
     * 
     */
    public String getHouseAddressDetail() {
        return houseAddressDetail;
    }

    /**
     * 数据字段 person_info.house_address_detail的set方法
     * 
     */
    public void setHouseAddressDetail(String houseAddressDetail) {
        this.houseAddressDetail = houseAddressDetail == null ? null : houseAddressDetail.trim();
    }

    /**
     * 数据字段 person_info.cert_validity_start的get方法 
     * 
     */
    public Date getCertValidityStart() {
        return certValidityStart;
    }

    /**
     * 数据字段 person_info.cert_validity_start的set方法
     * 
     */
    public void setCertValidityStart(Date certValidityStart) {
        this.certValidityStart = certValidityStart;
    }

    /**
     * 数据字段 person_info.cert_validity_end的get方法 
     * 
     */
    public Date getCertValidityEnd() {
        return certValidityEnd;
    }

    /**
     * 数据字段 person_info.cert_validity_end的set方法
     * 
     */
    public void setCertValidityEnd(Date certValidityEnd) {
        this.certValidityEnd = certValidityEnd;
    }

    /**
     * 数据字段 person_info.professional的get方法 
     * 
     */
    public String getProfessional() {
        return professional;
    }

    /**
     * 数据字段 person_info.professional的set方法
     * 
     */
    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    /**
     * 数据字段 person_info.is_effective的get方法 
     * 
     */
    public Integer getIsEffective() {
        return isEffective;
    }

    /**
     * 数据字段 person_info.is_effective的set方法
     * 
     */
    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    /**
     * 数据字段 person_info.zhima_score的get方法 
     * 
     */
    public Integer getZhimaScore() {
        return zhimaScore;
    }

    /**
     * 数据字段 person_info.zhima_score的set方法
     * 
     */
    public void setZhimaScore(Integer zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}