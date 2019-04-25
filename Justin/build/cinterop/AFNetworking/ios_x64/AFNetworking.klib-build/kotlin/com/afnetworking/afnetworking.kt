@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION")
package com.afnetworking

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs._NSZone
import cnames.structs.__SCNetworkReachability
import cnames.structs.__SecTrust
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import objcnames.classes.Protocol
import platform.CoreGraphics.CGFloat
import platform.Foundation.NSBundle
import platform.Foundation.NSCachedURLResponse
import platform.Foundation.NSCoder
import platform.Foundation.NSCopyingProtocol
import platform.Foundation.NSCopyingProtocolMeta
import platform.Foundation.NSData
import platform.Foundation.NSError
import platform.Foundation.NSErrorDomain
import platform.Foundation.NSHTTPURLResponse
import platform.Foundation.NSIndexSet
import platform.Foundation.NSInputStream
import platform.Foundation.NSJSONReadingOptions
import platform.Foundation.NSJSONWritingOptions
import platform.Foundation.NSMutableURLRequest
import platform.Foundation.NSOperationQueue
import platform.Foundation.NSProgress
import platform.Foundation.NSPropertyListFormat
import platform.Foundation.NSPropertyListReadOptions
import platform.Foundation.NSPropertyListWriteOptions
import platform.Foundation.NSSecureCodingProtocol
import platform.Foundation.NSSecureCodingProtocolMeta
import platform.Foundation.NSStringEncoding
import platform.Foundation.NSTimeInterval
import platform.Foundation.NSURL
import platform.Foundation.NSURLAuthenticationChallenge
import platform.Foundation.NSURLCredential
import platform.Foundation.NSURLRequest
import platform.Foundation.NSURLRequestCachePolicy
import platform.Foundation.NSURLRequestNetworkServiceType
import platform.Foundation.NSURLResponse
import platform.Foundation.NSURLSession
import platform.Foundation.NSURLSessionAuthChallengeDisposition
import platform.Foundation.NSURLSessionConfiguration
import platform.Foundation.NSURLSessionDataDelegateProtocol
import platform.Foundation.NSURLSessionDataDelegateProtocolMeta
import platform.Foundation.NSURLSessionDataTask
import platform.Foundation.NSURLSessionDelayedRequestDisposition
import platform.Foundation.NSURLSessionDelegateProtocol
import platform.Foundation.NSURLSessionDelegateProtocolMeta
import platform.Foundation.NSURLSessionDownloadDelegateProtocol
import platform.Foundation.NSURLSessionDownloadDelegateProtocolMeta
import platform.Foundation.NSURLSessionDownloadTask
import platform.Foundation.NSURLSessionResponseDisposition
import platform.Foundation.NSURLSessionTask
import platform.Foundation.NSURLSessionTaskDelegateProtocol
import platform.Foundation.NSURLSessionTaskDelegateProtocolMeta
import platform.Foundation.NSURLSessionTaskMetrics
import platform.Foundation.NSURLSessionUploadTask
import platform.Foundation.NSZone
import platform.Security.SecTrustRef
import platform.SystemConfiguration.SCNetworkReachabilityRef
import platform.UIKit.UIInteractionProtocol
import platform.UIKit.UIInteractionProtocolMeta
import platform.UIKit.UIView
import platform.darwin.NSInteger
import platform.darwin.NSIntegerVar
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSObjectProtocol
import platform.darwin.NSObjectProtocolMeta
import platform.darwin.NSUInteger
import platform.darwin.NSUIntegerVar
import platform.darwin.dispatch_group_t
import platform.darwin.dispatch_queue_t
import platform.posix.int64_t

// NOTE THIS FILE IS AUTO-GENERATED

fun UIGuidedAccessRestrictionStateForIdentifier(restrictionIdentifier: String): UIGuidedAccessRestrictionState {
    return UIGuidedAccessRestrictionState.byValue(kniBridge0(restrictionIdentifier.objcPtr()))
}

fun UIGuidedAccessConfigureAccessibilityFeatures(features: UIGuidedAccessAccessibilityFeature, enabled: Boolean, completion: (Boolean, NSError?) -> Unit): Unit {
    return kniBridge1(features, enabled.toByte(), createKotlinObjectHolder(completion))
}

fun AFPercentEscapedStringFromString(string: String): String {
    return interpretObjCPointerOrNull<String>(kniBridge3(string.objcPtr()))!!
}

fun AFQueryStringFromParameters(parameters: Map<Any?, *>): String {
    return interpretObjCPointerOrNull<String>(kniBridge4(parameters.objcPtr()))!!
}

fun AFStringFromNetworkReachabilityStatus(status: AFNetworkReachabilityStatus): String {
    return interpretObjCPointerOrNull<String>(kniBridge5(status))!!
}

@ExternalObjCClass("kniprot_com_afnetworking0") interface AFURLResponseSerializationProtocolMeta : NSObjectProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking0") interface AFURLResponseSerializationProtocol : NSObjectProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    
    @ObjCMethod("responseObjectForResponse:data:error:", "objcKniBridge2")
    fun responseObjectForResponse(response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any?
    
    @ObjCMethod("initWithCoder:", "objcKniBridge4")
    override fun initWithCoder(aDecoder: NSCoder): AFURLResponseSerializationProtocol?
}

@ExternalObjCClass("kniprot_com_afnetworking5") interface UIGuidedAccessRestrictionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking5") interface UIGuidedAccessRestrictionDelegateProtocol : NSObjectProtocol {
    
    final val guidedAccessRestrictionIdentifiers: List<*>?
        get() = objcKniBridge13(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("guidedAccessRestrictionWithIdentifier:didChangeState:", "objcKniBridge7")
    fun guidedAccessRestrictionWithIdentifier(restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit
    
    @ObjCMethod("textForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge9")
    fun textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String?
    
    @ObjCMethod("detailTextForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge11")
    fun detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String? = optional()
    
    @ObjCMethod("guidedAccessRestrictionIdentifiers", "objcKniBridge13")
    fun guidedAccessRestrictionIdentifiers(): List<*>?
}

@ExternalObjCClass("kniprot_com_afnetworking14") interface UIPencilInteractionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking14") interface UIPencilInteractionDelegateProtocol : NSObjectProtocol {
    
    @ObjCMethod("pencilInteractionDidTap:", "objcKniBridge16")
    fun pencilInteractionDidTap(interaction: UIPencilInteraction): Unit = optional()
}

@ExternalObjCClass("kniprot_com_afnetworking17") interface AFURLRequestSerializationProtocolMeta : NSObjectProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking17") interface AFURLRequestSerializationProtocol : NSObjectProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    
    @ObjCMethod("requestBySerializingRequest:withParameters:error:", "objcKniBridge19")
    fun requestBySerializingRequest(request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest?
    
    @ObjCMethod("initWithCoder:", "objcKniBridge21")
    override fun initWithCoder(aDecoder: NSCoder): AFURLRequestSerializationProtocol?
}

@ExternalObjCClass("kniprot_com_afnetworking22") interface AFMultipartFormDataProtocolMeta : ObjCObjectMeta {
}

@ExternalObjCClass("kniprot_com_afnetworking22") interface AFMultipartFormDataProtocol : ObjCObject {
    
    @ObjCMethod("appendPartWithFileURL:name:error:", "objcKniBridge24")
    fun appendPartWithFileURL(fileURL: NSURL, name: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("appendPartWithFileURL:name:fileName:mimeType:error:", "objcKniBridge26")
    fun appendPartWithFileURL(fileURL: NSURL, name: String, fileName: String, mimeType: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("appendPartWithInputStream:name:fileName:length:mimeType:", "objcKniBridge28")
    fun appendPartWithInputStream(inputStream: NSInputStream?, name: String, fileName: String, length: int64_t, mimeType: String): Unit
    
    @ObjCMethod("appendPartWithFileData:name:fileName:mimeType:", "objcKniBridge30")
    fun appendPartWithFileData(data: NSData, name: String, fileName: String, mimeType: String): Unit
    
    @ObjCMethod("appendPartWithFormData:name:", "objcKniBridge32")
    fun appendPartWithFormData(data: NSData, name: String): Unit
    
    @ObjCMethod("appendPartWithHeaders:body:", "objcKniBridge34")
    fun appendPartWithHeaders(headers: Map<Any?, *>?, body: NSData): Unit
    
    @ObjCMethod("throttleBandwidthWithPacketSize:delay:", "objcKniBridge36")
    fun throttleBandwidthWithPacketSize(numberOfBytes: NSUInteger, delay: NSTimeInterval): Unit
}

@ExternalObjCClass open class AFHTTPResponseSerializerMeta : NSObjectMeta, AFURLResponseSerializationProtocolMeta {
    
    @ObjCMethod("serializer", "objcKniBridge38")
    external open fun serializer(): AFHTTPResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge40")
    external override fun new(): AFHTTPResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge42")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge44")
    external override fun alloc(): AFHTTPResponseSerializer?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge46")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPResponseSerializer : NSObject, AFURLResponseSerializationProtocol {
    companion object : AFHTTPResponseSerializerMeta(), ObjCClassOf<AFHTTPResponseSerializer> {}
    
    var stringEncoding: NSStringEncoding
        get() = objcKniBridge52(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge54(nativeNullPtr, this.objcPtr(), value)
    
    var acceptableStatusCodes: NSIndexSet?
        get() = objcKniBridge56(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge58(nativeNullPtr, this.objcPtr(), value)
    
    var acceptableContentTypes: Set<*>?
        get() = objcKniBridge60(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge62(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("init", "objcKniBridge48")
    external override fun init(): AFHTTPResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("validateResponse:data:error:", "objcKniBridge50")
    external open fun validateResponse(response: NSHTTPURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean
    
    @ObjCMethod("stringEncoding", "objcKniBridge52")
    external open fun stringEncoding(): NSStringEncoding
    
    @ObjCMethod("setStringEncoding:", "objcKniBridge54")
    external open fun setStringEncoding(stringEncoding: NSStringEncoding): Unit
    
    @ObjCMethod("acceptableStatusCodes", "objcKniBridge56")
    external open fun acceptableStatusCodes(): NSIndexSet?
    
    @ObjCMethod("setAcceptableStatusCodes:", "objcKniBridge58")
    external open fun setAcceptableStatusCodes(acceptableStatusCodes: NSIndexSet?): Unit
    
    @ObjCMethod("acceptableContentTypes", "objcKniBridge60")
    external open fun acceptableContentTypes(): Set<*>?
    
    @ObjCMethod("setAcceptableContentTypes:", "objcKniBridge62")
    external open fun setAcceptableContentTypes(acceptableContentTypes: Set<*>?): Unit
    
    @ObjCMethod("initWithCoder:", "objcKniBridge64")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("responseObjectForResponse:data:error:", "objcKniBridge66")
    external override fun responseObjectForResponse(response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any?
    
    @ObjCMethod("isEqual:", "objcKniBridge68")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge70")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge72")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge74")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge76")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge78")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge80")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge82")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge84")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge86")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge88")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge90")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge92")
    external override fun description(): String?
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge94")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge96")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge98")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class AFJSONResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializerWithReadingOptions:", "objcKniBridge100")
    external open fun serializerWithReadingOptions(readingOptions: NSJSONReadingOptions): AFJSONResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge102")
    external override fun serializer(): AFJSONResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge104")
    external override fun new(): AFJSONResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge106")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFJSONResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge108")
    external override fun alloc(): AFJSONResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFJSONResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFJSONResponseSerializerMeta(), ObjCClassOf<AFJSONResponseSerializer> {}
    
    var readingOptions: NSJSONReadingOptions
        get() = objcKniBridge110(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge112(nativeNullPtr, this.objcPtr(), value)
    
    var removesKeysWithNullValues: Boolean
        get() = objcKniBridge114(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge116(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("readingOptions", "objcKniBridge110")
    external open fun readingOptions(): NSJSONReadingOptions
    
    @ObjCMethod("setReadingOptions:", "objcKniBridge112")
    external open fun setReadingOptions(readingOptions: NSJSONReadingOptions): Unit
    
    @ObjCMethod("removesKeysWithNullValues", "objcKniBridge114")
    external open fun removesKeysWithNullValues(): Boolean
    
    @ObjCMethod("setRemovesKeysWithNullValues:", "objcKniBridge116")
    external open fun setRemovesKeysWithNullValues(removesKeysWithNullValues: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge118")
    external override fun init(): AFJSONResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge120")
    external override fun initWithCoder(aDecoder: NSCoder): AFJSONResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFXMLParserResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializer", "objcKniBridge122")
    external override fun serializer(): AFXMLParserResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge124")
    external override fun new(): AFXMLParserResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge126")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFXMLParserResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge128")
    external override fun alloc(): AFXMLParserResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFXMLParserResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFXMLParserResponseSerializerMeta(), ObjCClassOf<AFXMLParserResponseSerializer> {}
    
    @ObjCMethod("init", "objcKniBridge130")
    external override fun init(): AFXMLParserResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge132")
    external override fun initWithCoder(aDecoder: NSCoder): AFXMLParserResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFPropertyListResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializerWithFormat:readOptions:", "objcKniBridge134")
    external open fun serializerWithFormat(format: NSPropertyListFormat, readOptions: NSPropertyListReadOptions): AFPropertyListResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge136")
    external override fun serializer(): AFPropertyListResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge138")
    external override fun new(): AFPropertyListResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge140")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFPropertyListResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge142")
    external override fun alloc(): AFPropertyListResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFPropertyListResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFPropertyListResponseSerializerMeta(), ObjCClassOf<AFPropertyListResponseSerializer> {}
    
    var format: NSPropertyListFormat
        get() = objcKniBridge144(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge146(nativeNullPtr, this.objcPtr(), value)
    
    var readOptions: NSPropertyListReadOptions
        get() = objcKniBridge148(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge150(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("format", "objcKniBridge144")
    external open fun format(): NSPropertyListFormat
    
    @ObjCMethod("setFormat:", "objcKniBridge146")
    external open fun setFormat(format: NSPropertyListFormat): Unit
    
    @ObjCMethod("readOptions", "objcKniBridge148")
    external open fun readOptions(): NSPropertyListReadOptions
    
    @ObjCMethod("setReadOptions:", "objcKniBridge150")
    external open fun setReadOptions(readOptions: NSPropertyListReadOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge152")
    external override fun init(): AFPropertyListResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge154")
    external override fun initWithCoder(aDecoder: NSCoder): AFPropertyListResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFImageResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("serializer", "objcKniBridge156")
    external override fun serializer(): AFImageResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge158")
    external override fun new(): AFImageResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge160")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFImageResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge162")
    external override fun alloc(): AFImageResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFImageResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFImageResponseSerializerMeta(), ObjCClassOf<AFImageResponseSerializer> {}
    
    var imageScale: CGFloat
        get() = objcKniBridge164(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge166(nativeNullPtr, this.objcPtr(), value)
    
    var automaticallyInflatesResponseImage: Boolean
        get() = objcKniBridge168(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge170(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("imageScale", "objcKniBridge164")
    external open fun imageScale(): CGFloat
    
    @ObjCMethod("setImageScale:", "objcKniBridge166")
    external open fun setImageScale(imageScale: CGFloat): Unit
    
    @ObjCMethod("automaticallyInflatesResponseImage", "objcKniBridge168")
    external open fun automaticallyInflatesResponseImage(): Boolean
    
    @ObjCMethod("setAutomaticallyInflatesResponseImage:", "objcKniBridge170")
    external open fun setAutomaticallyInflatesResponseImage(automaticallyInflatesResponseImage: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge172")
    external override fun init(): AFImageResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge174")
    external override fun initWithCoder(aDecoder: NSCoder): AFImageResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFCompoundResponseSerializerMeta : AFHTTPResponseSerializerMeta {
    
    @ObjCMethod("compoundSerializerWithResponseSerializers:", "objcKniBridge176")
    external open fun compoundSerializerWithResponseSerializers(responseSerializers: List<*>): AFCompoundResponseSerializer
    
    @ObjCMethod("serializer", "objcKniBridge178")
    external override fun serializer(): AFCompoundResponseSerializer
    
    @ObjCMethod("new", "objcKniBridge180")
    external override fun new(): AFCompoundResponseSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge182")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFCompoundResponseSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge184")
    external override fun alloc(): AFCompoundResponseSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFCompoundResponseSerializer : AFHTTPResponseSerializer {
    companion object : AFCompoundResponseSerializerMeta(), ObjCClassOf<AFCompoundResponseSerializer> {}
    
    val responseSerializers: List<*>
        get() = objcKniBridge186(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("responseSerializers", "objcKniBridge186")
    external open fun responseSerializers(): List<*>
    
    @ObjCMethod("init", "objcKniBridge188")
    external override fun init(): AFCompoundResponseSerializer
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge190")
    external override fun initWithCoder(aDecoder: NSCoder): AFCompoundResponseSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class UIPencilInteractionMeta : NSObjectMeta, UIInteractionProtocolMeta {
    
    val preferredTapAction: UIPencilPreferredAction
        get() = objcKniBridge192(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("preferredTapAction", "objcKniBridge192")
    external open fun preferredTapAction(): UIPencilPreferredAction
    
    @ObjCMethod("new", "objcKniBridge194")
    external override fun new(): UIPencilInteraction?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge196")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIPencilInteraction?
    
    @ObjCMethod("alloc", "objcKniBridge198")
    external override fun alloc(): UIPencilInteraction?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIPencilInteraction : NSObject, UIInteractionProtocol {
    companion object : UIPencilInteractionMeta(), ObjCClassOf<UIPencilInteraction> {}
    
    var delegate: UIPencilInteractionDelegateProtocol?
        get() = objcKniBridge200(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge202(nativeNullPtr, this.objcPtr(), value)
    
    var enabled: Boolean
        get() = objcKniBridge204(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge206(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("delegate", "objcKniBridge200")
    external open fun delegate(): UIPencilInteractionDelegateProtocol?
    
    @ObjCMethod("setDelegate:", "objcKniBridge202")
    external open fun setDelegate(delegate: UIPencilInteractionDelegateProtocol?): Unit
    
    @ObjCMethod("isEnabled", "objcKniBridge204")
    external open fun isEnabled(): Boolean
    
    @ObjCMethod("setEnabled:", "objcKniBridge206")
    external open fun setEnabled(enabled: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge208")
    external override fun init(): UIPencilInteraction?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("willMoveToView:", "objcKniBridge210")
    external override fun willMoveToView(view: UIView?): Unit
    
    @ObjCMethod("didMoveToView:", "objcKniBridge212")
    external override fun didMoveToView(view: UIView?): Unit
    
    @ObjCMethod("view", "objcKniBridge214")
    external override fun view(): UIView?
    
    @ObjCMethod("isEqual:", "objcKniBridge216")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge218")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge220")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge222")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge224")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge226")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge228")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge230")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge232")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge234")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge236")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge238")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge240")
    external override fun description(): String?
    
    @ObjCMethod("debugDescription", "objcKniBridge242")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class AFHTTPRequestSerializerMeta : NSObjectMeta, AFURLRequestSerializationProtocolMeta {
    
    @ObjCMethod("serializer", "objcKniBridge244")
    external open fun serializer(): AFHTTPRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge246")
    external override fun new(): AFHTTPRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge248")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge250")
    external override fun alloc(): AFHTTPRequestSerializer?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge252")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPRequestSerializer : NSObject, AFURLRequestSerializationProtocol {
    companion object : AFHTTPRequestSerializerMeta(), ObjCClassOf<AFHTTPRequestSerializer> {}
    
    var stringEncoding: NSStringEncoding
        get() = objcKniBridge272(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge274(nativeNullPtr, this.objcPtr(), value)
    
    var allowsCellularAccess: Boolean
        get() = objcKniBridge276(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge278(nativeNullPtr, this.objcPtr(), value)
    
    var cachePolicy: NSURLRequestCachePolicy
        get() = objcKniBridge280(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge282(nativeNullPtr, this.objcPtr(), value)
    
    var HTTPShouldHandleCookies: Boolean
        get() = objcKniBridge284(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge286(nativeNullPtr, this.objcPtr(), value)
    
    var HTTPShouldUsePipelining: Boolean
        get() = objcKniBridge288(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge290(nativeNullPtr, this.objcPtr(), value)
    
    var networkServiceType: NSURLRequestNetworkServiceType
        get() = objcKniBridge292(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge294(nativeNullPtr, this.objcPtr(), value)
    
    var timeoutInterval: NSTimeInterval
        get() = objcKniBridge296(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge298(nativeNullPtr, this.objcPtr(), value)
    
    val HTTPRequestHeaders: Map<Any?, *>
        get() = objcKniBridge300(nativeNullPtr, this.objcPtr())
    
    var HTTPMethodsEncodingParametersInURI: Set<*>
        get() = objcKniBridge302(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge304(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("setValue:forHTTPHeaderField:", "objcKniBridge254")
    external open fun setValue(value: String?, forHTTPHeaderField: String): Unit
    
    @ObjCMethod("valueForHTTPHeaderField:", "objcKniBridge256")
    external open fun valueForHTTPHeaderField(field: String): String?
    
    @ObjCMethod("setAuthorizationHeaderFieldWithUsername:password:", "objcKniBridge258")
    external open fun setAuthorizationHeaderFieldWithUsername(username: String, password: String): Unit
    
    @ObjCMethod("clearAuthorizationHeader", "objcKniBridge260")
    external open fun clearAuthorizationHeader(): Unit
    
    @ObjCMethod("setQueryStringSerializationWithStyle:", "objcKniBridge262")
    external open fun setQueryStringSerializationWithStyle(style: AFHTTPRequestQueryStringSerializationStyle): Unit
    
    @ObjCMethod("setQueryStringSerializationWithBlock:", "objcKniBridge264")
    external open fun setQueryStringSerializationWithBlock(block: ((NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?)?): Unit
    
    @ObjCMethod("requestWithMethod:URLString:parameters:error:", "objcKniBridge266")
    external open fun requestWithMethod(method: String, URLString: String, parameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest
    
    @ObjCMethod("multipartFormRequestWithMethod:URLString:parameters:constructingBodyWithBlock:error:", "objcKniBridge268")
    external open fun multipartFormRequestWithMethod(method: String, URLString: String, parameters: Map<Any?, *>?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest
    
    @ObjCMethod("requestWithMultipartFormRequest:writingStreamContentsToFile:completionHandler:", "objcKniBridge270")
    external open fun requestWithMultipartFormRequest(request: NSURLRequest, writingStreamContentsToFile: NSURL, completionHandler: ((NSError?) -> Unit)?): NSMutableURLRequest
    
    @ObjCMethod("stringEncoding", "objcKniBridge272")
    external open fun stringEncoding(): NSStringEncoding
    
    @ObjCMethod("setStringEncoding:", "objcKniBridge274")
    external open fun setStringEncoding(stringEncoding: NSStringEncoding): Unit
    
    @ObjCMethod("allowsCellularAccess", "objcKniBridge276")
    external open fun allowsCellularAccess(): Boolean
    
    @ObjCMethod("setAllowsCellularAccess:", "objcKniBridge278")
    external open fun setAllowsCellularAccess(allowsCellularAccess: Boolean): Unit
    
    @ObjCMethod("cachePolicy", "objcKniBridge280")
    external open fun cachePolicy(): NSURLRequestCachePolicy
    
    @ObjCMethod("setCachePolicy:", "objcKniBridge282")
    external open fun setCachePolicy(cachePolicy: NSURLRequestCachePolicy): Unit
    
    @ObjCMethod("HTTPShouldHandleCookies", "objcKniBridge284")
    external open fun HTTPShouldHandleCookies(): Boolean
    
    @ObjCMethod("setHTTPShouldHandleCookies:", "objcKniBridge286")
    external open fun setHTTPShouldHandleCookies(HTTPShouldHandleCookies: Boolean): Unit
    
    @ObjCMethod("HTTPShouldUsePipelining", "objcKniBridge288")
    external open fun HTTPShouldUsePipelining(): Boolean
    
    @ObjCMethod("setHTTPShouldUsePipelining:", "objcKniBridge290")
    external open fun setHTTPShouldUsePipelining(HTTPShouldUsePipelining: Boolean): Unit
    
    @ObjCMethod("networkServiceType", "objcKniBridge292")
    external open fun networkServiceType(): NSURLRequestNetworkServiceType
    
    @ObjCMethod("setNetworkServiceType:", "objcKniBridge294")
    external open fun setNetworkServiceType(networkServiceType: NSURLRequestNetworkServiceType): Unit
    
    @ObjCMethod("timeoutInterval", "objcKniBridge296")
    external open fun timeoutInterval(): NSTimeInterval
    
    @ObjCMethod("setTimeoutInterval:", "objcKniBridge298")
    external open fun setTimeoutInterval(timeoutInterval: NSTimeInterval): Unit
    
    @ObjCMethod("HTTPRequestHeaders", "objcKniBridge300")
    external open fun HTTPRequestHeaders(): Map<Any?, *>
    
    @ObjCMethod("HTTPMethodsEncodingParametersInURI", "objcKniBridge302")
    external open fun HTTPMethodsEncodingParametersInURI(): Set<*>
    
    @ObjCMethod("setHTTPMethodsEncodingParametersInURI:", "objcKniBridge304")
    external open fun setHTTPMethodsEncodingParametersInURI(HTTPMethodsEncodingParametersInURI: Set<*>): Unit
    
    @ObjCMethod("init", "objcKniBridge306")
    external override fun init(): AFHTTPRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge308")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("requestBySerializingRequest:withParameters:error:", "objcKniBridge310")
    external override fun requestBySerializingRequest(request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest?
    
    @ObjCMethod("isEqual:", "objcKniBridge312")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge314")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge316")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge318")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge320")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge322")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge324")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge326")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge328")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge330")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge332")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge334")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge336")
    external override fun description(): String?
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge338")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge340")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge342")
    external override fun debugDescription(): String?
}

@ExternalObjCClass open class AFJSONRequestSerializerMeta : AFHTTPRequestSerializerMeta {
    
    @ObjCMethod("serializerWithWritingOptions:", "objcKniBridge344")
    external open fun serializerWithWritingOptions(writingOptions: NSJSONWritingOptions): AFJSONRequestSerializer
    
    @ObjCMethod("serializer", "objcKniBridge346")
    external override fun serializer(): AFJSONRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge348")
    external override fun new(): AFJSONRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge350")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFJSONRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge352")
    external override fun alloc(): AFJSONRequestSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFJSONRequestSerializer : AFHTTPRequestSerializer {
    companion object : AFJSONRequestSerializerMeta(), ObjCClassOf<AFJSONRequestSerializer> {}
    
    var writingOptions: NSJSONWritingOptions
        get() = objcKniBridge354(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge356(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("writingOptions", "objcKniBridge354")
    external open fun writingOptions(): NSJSONWritingOptions
    
    @ObjCMethod("setWritingOptions:", "objcKniBridge356")
    external open fun setWritingOptions(writingOptions: NSJSONWritingOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge358")
    external override fun init(): AFJSONRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge360")
    external override fun initWithCoder(aDecoder: NSCoder): AFJSONRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFPropertyListRequestSerializerMeta : AFHTTPRequestSerializerMeta {
    
    @ObjCMethod("serializerWithFormat:writeOptions:", "objcKniBridge362")
    external open fun serializerWithFormat(format: NSPropertyListFormat, writeOptions: NSPropertyListWriteOptions): AFPropertyListRequestSerializer
    
    @ObjCMethod("serializer", "objcKniBridge364")
    external override fun serializer(): AFPropertyListRequestSerializer
    
    @ObjCMethod("new", "objcKniBridge366")
    external override fun new(): AFPropertyListRequestSerializer?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge368")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFPropertyListRequestSerializer?
    
    @ObjCMethod("alloc", "objcKniBridge370")
    external override fun alloc(): AFPropertyListRequestSerializer?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFPropertyListRequestSerializer : AFHTTPRequestSerializer {
    companion object : AFPropertyListRequestSerializerMeta(), ObjCClassOf<AFPropertyListRequestSerializer> {}
    
    var format: NSPropertyListFormat
        get() = objcKniBridge372(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge374(nativeNullPtr, this.objcPtr(), value)
    
    var writeOptions: NSPropertyListWriteOptions
        get() = objcKniBridge376(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge378(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("format", "objcKniBridge372")
    external open fun format(): NSPropertyListFormat
    
    @ObjCMethod("setFormat:", "objcKniBridge374")
    external open fun setFormat(format: NSPropertyListFormat): Unit
    
    @ObjCMethod("writeOptions", "objcKniBridge376")
    external open fun writeOptions(): NSPropertyListWriteOptions
    
    @ObjCMethod("setWriteOptions:", "objcKniBridge378")
    external open fun setWriteOptions(writeOptions: NSPropertyListWriteOptions): Unit
    
    @ObjCMethod("init", "objcKniBridge380")
    external override fun init(): AFPropertyListRequestSerializer?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge382")
    external override fun initWithCoder(aDecoder: NSCoder): AFPropertyListRequestSerializer?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
}

@ExternalObjCClass open class AFSecurityPolicyMeta : NSObjectMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("certificatesInBundle:", "objcKniBridge384")
    external open fun certificatesInBundle(bundle: NSBundle): Set<*>
    
    @ObjCMethod("defaultPolicy", "objcKniBridge386")
    external open fun defaultPolicy(): AFSecurityPolicy
    
    @ObjCMethod("policyWithPinningMode:", "objcKniBridge388")
    external open fun policyWithPinningMode(pinningMode: AFSSLPinningMode): AFSecurityPolicy
    
    @ObjCMethod("policyWithPinningMode:withPinnedCertificates:", "objcKniBridge390")
    external open fun policyWithPinningMode(pinningMode: AFSSLPinningMode, withPinnedCertificates: Set<*>): AFSecurityPolicy
    
    @ObjCMethod("new", "objcKniBridge392")
    external override fun new(): AFSecurityPolicy?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge394")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFSecurityPolicy?
    
    @ObjCMethod("alloc", "objcKniBridge396")
    external override fun alloc(): AFSecurityPolicy?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge398")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFSecurityPolicy : NSObject, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFSecurityPolicyMeta(), ObjCClassOf<AFSecurityPolicy> {}
    
    val SSLPinningMode: AFSSLPinningMode
        get() = objcKniBridge402(nativeNullPtr, this.objcPtr())
    
    var pinnedCertificates: Set<*>?
        get() = objcKniBridge404(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge406(nativeNullPtr, this.objcPtr(), value)
    
    var allowInvalidCertificates: Boolean
        get() = objcKniBridge408(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge410(nativeNullPtr, this.objcPtr(), value)
    
    var validatesDomainName: Boolean
        get() = objcKniBridge412(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge414(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("evaluateServerTrust:forDomain:", "objcKniBridge400")
    external open fun evaluateServerTrust(serverTrust: SecTrustRef?, forDomain: String?): Boolean
    
    @ObjCMethod("SSLPinningMode", "objcKniBridge402")
    external open fun SSLPinningMode(): AFSSLPinningMode
    
    @ObjCMethod("pinnedCertificates", "objcKniBridge404")
    external open fun pinnedCertificates(): Set<*>?
    
    @ObjCMethod("setPinnedCertificates:", "objcKniBridge406")
    external open fun setPinnedCertificates(pinnedCertificates: Set<*>?): Unit
    
    @ObjCMethod("allowInvalidCertificates", "objcKniBridge408")
    external open fun allowInvalidCertificates(): Boolean
    
    @ObjCMethod("setAllowInvalidCertificates:", "objcKniBridge410")
    external open fun setAllowInvalidCertificates(allowInvalidCertificates: Boolean): Unit
    
    @ObjCMethod("validatesDomainName", "objcKniBridge412")
    external open fun validatesDomainName(): Boolean
    
    @ObjCMethod("setValidatesDomainName:", "objcKniBridge414")
    external open fun setValidatesDomainName(validatesDomainName: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge416")
    external override fun init(): AFSecurityPolicy?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge418")
    external override fun initWithCoder(aDecoder: NSCoder): AFSecurityPolicy?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge420")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge422")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

@ExternalObjCClass open class AFNetworkReachabilityManagerMeta : NSObjectMeta {
    
    @ObjCMethod("sharedManager", "objcKniBridge424")
    external open fun sharedManager(): AFNetworkReachabilityManager
    
    @ObjCMethod("manager", "objcKniBridge426")
    external open fun manager(): AFNetworkReachabilityManager
    
    @ObjCMethod("managerForDomain:", "objcKniBridge428")
    external open fun managerForDomain(domain: String): AFNetworkReachabilityManager
    
    @ObjCMethod("managerForAddress:", "objcKniBridge430")
    external open fun managerForAddress(address: COpaquePointer?): AFNetworkReachabilityManager
    
    @ObjCMethod("new", "objcKniBridge432")
    external override fun new(): AFNetworkReachabilityManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge434")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFNetworkReachabilityManager?
    
    @ObjCMethod("alloc", "objcKniBridge436")
    external override fun alloc(): AFNetworkReachabilityManager?
    
    protected constructor() {}
}

@ExternalObjCClass open class AFNetworkReachabilityManager : NSObject {
    companion object : AFNetworkReachabilityManagerMeta(), ObjCClassOf<AFNetworkReachabilityManager> {}
    
    val networkReachabilityStatus: AFNetworkReachabilityStatus
        get() = objcKniBridge448(nativeNullPtr, this.objcPtr())
    
    val reachable: Boolean
        get() = objcKniBridge450(nativeNullPtr, this.objcPtr())
    
    val reachableViaWWAN: Boolean
        get() = objcKniBridge452(nativeNullPtr, this.objcPtr())
    
    val reachableViaWiFi: Boolean
        get() = objcKniBridge454(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("initWithReachability:", "objcKniBridge438")
    external open fun initWithReachability(reachability: SCNetworkReachabilityRef?): AFNetworkReachabilityManager
    
    @ObjCConstructor("initWithReachability:", true)
    constructor(reachability: SCNetworkReachabilityRef?) {}
    
    @ObjCMethod("startMonitoring", "objcKniBridge440")
    external open fun startMonitoring(): Unit
    
    @ObjCMethod("stopMonitoring", "objcKniBridge442")
    external open fun stopMonitoring(): Unit
    
    @ObjCMethod("localizedNetworkReachabilityStatusString", "objcKniBridge444")
    external open fun localizedNetworkReachabilityStatusString(): String
    
    @ObjCMethod("setReachabilityStatusChangeBlock:", "objcKniBridge446")
    external open fun setReachabilityStatusChangeBlock(block: ((AFNetworkReachabilityStatus) -> Unit)?): Unit
    
    @ObjCMethod("networkReachabilityStatus", "objcKniBridge448")
    external open fun networkReachabilityStatus(): AFNetworkReachabilityStatus
    
    @ObjCMethod("isReachable", "objcKniBridge450")
    external open fun isReachable(): Boolean
    
    @ObjCMethod("isReachableViaWWAN", "objcKniBridge452")
    external open fun isReachableViaWWAN(): Boolean
    
    @ObjCMethod("isReachableViaWiFi", "objcKniBridge454")
    external open fun isReachableViaWiFi(): Boolean
    
    @ObjCMethod("init", "objcKniBridge456")
    external override fun init(): AFNetworkReachabilityManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
}

@ExternalObjCClass open class AFURLSessionManagerMeta : NSObjectMeta, NSURLSessionDelegateProtocolMeta, NSURLSessionTaskDelegateProtocolMeta, NSURLSessionDataDelegateProtocolMeta, NSURLSessionDownloadDelegateProtocolMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("new", "objcKniBridge458")
    external override fun new(): AFURLSessionManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge460")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFURLSessionManager?
    
    @ObjCMethod("alloc", "objcKniBridge462")
    external override fun alloc(): AFURLSessionManager?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge464")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFURLSessionManager : NSObject, NSURLSessionDelegateProtocol, NSURLSessionTaskDelegateProtocol, NSURLSessionDataDelegateProtocol, NSURLSessionDownloadDelegateProtocol, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFURLSessionManagerMeta(), ObjCClassOf<AFURLSessionManager> {}
    
    val session: NSURLSession
        get() = objcKniBridge518(nativeNullPtr, this.objcPtr())
    
    val operationQueue: NSOperationQueue
        get() = objcKniBridge520(nativeNullPtr, this.objcPtr())
    
    var responseSerializer: AFURLResponseSerializationProtocol
        get() = objcKniBridge522(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge524(nativeNullPtr, this.objcPtr(), value)
    
    var securityPolicy: AFSecurityPolicy
        get() = objcKniBridge526(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge528(nativeNullPtr, this.objcPtr(), value)
    
    var reachabilityManager: AFNetworkReachabilityManager
        get() = objcKniBridge530(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge532(nativeNullPtr, this.objcPtr(), value)
    
    val tasks: List<*>
        get() = objcKniBridge534(nativeNullPtr, this.objcPtr())
    
    val dataTasks: List<*>
        get() = objcKniBridge536(nativeNullPtr, this.objcPtr())
    
    val uploadTasks: List<*>
        get() = objcKniBridge538(nativeNullPtr, this.objcPtr())
    
    val downloadTasks: List<*>
        get() = objcKniBridge540(nativeNullPtr, this.objcPtr())
    
    var completionQueue: dispatch_queue_t?
        get() = objcKniBridge542(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge544(nativeNullPtr, this.objcPtr(), value)
    
    var completionGroup: dispatch_group_t?
        get() = objcKniBridge546(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge548(nativeNullPtr, this.objcPtr(), value)
    
    var attemptsToRecreateUploadTasksForBackgroundSessions: Boolean
        get() = objcKniBridge550(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge552(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initWithSessionConfiguration:", "objcKniBridge466")
    external open fun initWithSessionConfiguration(configuration: NSURLSessionConfiguration?): AFURLSessionManager
    
    @ObjCConstructor("initWithSessionConfiguration:", true)
    constructor(sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("invalidateSessionCancelingTasks:", "objcKniBridge468")
    external open fun invalidateSessionCancelingTasks(cancelPendingTasks: Boolean): Unit
    
    @ObjCMethod("dataTaskWithRequest:completionHandler:", "objcKniBridge470")
    external open fun dataTaskWithRequest(request: NSURLRequest, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask
    
    @ObjCMethod("dataTaskWithRequest:uploadProgress:downloadProgress:completionHandler:", "objcKniBridge472")
    external open fun dataTaskWithRequest(request: NSURLRequest, uploadProgress: ((NSProgress?) -> Unit)?, downloadProgress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask
    
    @ObjCMethod("uploadTaskWithRequest:fromFile:progress:completionHandler:", "objcKniBridge474")
    external open fun uploadTaskWithRequest(request: NSURLRequest, fromFile: NSURL, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("uploadTaskWithRequest:fromData:progress:completionHandler:", "objcKniBridge476")
    external open fun uploadTaskWithRequest(request: NSURLRequest, fromData: NSData?, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("uploadTaskWithStreamedRequest:progress:completionHandler:", "objcKniBridge478")
    external open fun uploadTaskWithStreamedRequest(request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask
    
    @ObjCMethod("downloadTaskWithRequest:progress:destination:completionHandler:", "objcKniBridge480")
    external open fun downloadTaskWithRequest(request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask
    
    @ObjCMethod("downloadTaskWithResumeData:progress:destination:completionHandler:", "objcKniBridge482")
    external open fun downloadTaskWithResumeData(resumeData: NSData, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask
    
    @ObjCMethod("uploadProgressForTask:", "objcKniBridge484")
    external open fun uploadProgressForTask(task: NSURLSessionTask): NSProgress?
    
    @ObjCMethod("downloadProgressForTask:", "objcKniBridge486")
    external open fun downloadProgressForTask(task: NSURLSessionTask): NSProgress?
    
    @ObjCMethod("setSessionDidBecomeInvalidBlock:", "objcKniBridge488")
    external open fun setSessionDidBecomeInvalidBlock(block: ((NSURLSession?, NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setSessionDidReceiveAuthenticationChallengeBlock:", "objcKniBridge490")
    external open fun setSessionDidReceiveAuthenticationChallengeBlock(block: ((NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit
    
    @ObjCMethod("setTaskNeedNewBodyStreamBlock:", "objcKniBridge492")
    external open fun setTaskNeedNewBodyStreamBlock(block: ((NSURLSession?, NSURLSessionTask?) -> NSInputStream?)?): Unit
    
    @ObjCMethod("setTaskWillPerformHTTPRedirectionBlock:", "objcKniBridge494")
    external open fun setTaskWillPerformHTTPRedirectionBlock(block: ((NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?)?): Unit
    
    @ObjCMethod("setTaskDidReceiveAuthenticationChallengeBlock:", "objcKniBridge496")
    external open fun setTaskDidReceiveAuthenticationChallengeBlock(block: ((NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit
    
    @ObjCMethod("setTaskDidSendBodyDataBlock:", "objcKniBridge498")
    external open fun setTaskDidSendBodyDataBlock(block: ((NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("setTaskDidCompleteBlock:", "objcKniBridge500")
    external open fun setTaskDidCompleteBlock(block: ((NSURLSession?, NSURLSessionTask?, NSError?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskDidReceiveResponseBlock:", "objcKniBridge502")
    external open fun setDataTaskDidReceiveResponseBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition)?): Unit
    
    @ObjCMethod("setDataTaskDidBecomeDownloadTaskBlock:", "objcKniBridge504")
    external open fun setDataTaskDidBecomeDownloadTaskBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskDidReceiveDataBlock:", "objcKniBridge506")
    external open fun setDataTaskDidReceiveDataBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit)?): Unit
    
    @ObjCMethod("setDataTaskWillCacheResponseBlock:", "objcKniBridge508")
    external open fun setDataTaskWillCacheResponseBlock(block: ((NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?)?): Unit
    
    @ObjCMethod("setDidFinishEventsForBackgroundURLSessionBlock:", "objcKniBridge510")
    external open fun setDidFinishEventsForBackgroundURLSessionBlock(block: ((NSURLSession?) -> Unit)?): Unit
    
    @ObjCMethod("setDownloadTaskDidFinishDownloadingBlock:", "objcKniBridge512")
    external open fun setDownloadTaskDidFinishDownloadingBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?)?): Unit
    
    @ObjCMethod("setDownloadTaskDidWriteDataBlock:", "objcKniBridge514")
    external open fun setDownloadTaskDidWriteDataBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("setDownloadTaskDidResumeBlock:", "objcKniBridge516")
    external open fun setDownloadTaskDidResumeBlock(block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit)?): Unit
    
    @ObjCMethod("session", "objcKniBridge518")
    external open fun session(): NSURLSession
    
    @ObjCMethod("operationQueue", "objcKniBridge520")
    external open fun operationQueue(): NSOperationQueue
    
    @ObjCMethod("responseSerializer", "objcKniBridge522")
    external open fun responseSerializer(): AFURLResponseSerializationProtocol
    
    @ObjCMethod("setResponseSerializer:", "objcKniBridge524")
    external open fun setResponseSerializer(responseSerializer: AFURLResponseSerializationProtocol): Unit
    
    @ObjCMethod("securityPolicy", "objcKniBridge526")
    external open fun securityPolicy(): AFSecurityPolicy
    
    @ObjCMethod("setSecurityPolicy:", "objcKniBridge528")
    external open fun setSecurityPolicy(securityPolicy: AFSecurityPolicy): Unit
    
    @ObjCMethod("reachabilityManager", "objcKniBridge530")
    external open fun reachabilityManager(): AFNetworkReachabilityManager
    
    @ObjCMethod("setReachabilityManager:", "objcKniBridge532")
    external open fun setReachabilityManager(reachabilityManager: AFNetworkReachabilityManager): Unit
    
    @ObjCMethod("tasks", "objcKniBridge534")
    external open fun tasks(): List<*>
    
    @ObjCMethod("dataTasks", "objcKniBridge536")
    external open fun dataTasks(): List<*>
    
    @ObjCMethod("uploadTasks", "objcKniBridge538")
    external open fun uploadTasks(): List<*>
    
    @ObjCMethod("downloadTasks", "objcKniBridge540")
    external open fun downloadTasks(): List<*>
    
    @ObjCMethod("completionQueue", "objcKniBridge542")
    external open fun completionQueue(): dispatch_queue_t?
    
    @ObjCMethod("setCompletionQueue:", "objcKniBridge544")
    external open fun setCompletionQueue(completionQueue: dispatch_queue_t?): Unit
    
    @ObjCMethod("completionGroup", "objcKniBridge546")
    external open fun completionGroup(): dispatch_group_t?
    
    @ObjCMethod("setCompletionGroup:", "objcKniBridge548")
    external open fun setCompletionGroup(completionGroup: dispatch_group_t?): Unit
    
    @ObjCMethod("attemptsToRecreateUploadTasksForBackgroundSessions", "objcKniBridge550")
    external open fun attemptsToRecreateUploadTasksForBackgroundSessions(): Boolean
    
    @ObjCMethod("setAttemptsToRecreateUploadTasksForBackgroundSessions:", "objcKniBridge552")
    external open fun setAttemptsToRecreateUploadTasksForBackgroundSessions(attemptsToRecreateUploadTasksForBackgroundSessions: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge554")
    external override fun init(): AFURLSessionManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge556")
    external override fun initWithCoder(aDecoder: NSCoder): AFURLSessionManager?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("isEqual:", "objcKniBridge558")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge560")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge562")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge564")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge566")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge568")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge570")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge572")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge574")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge576")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge578")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge580")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge582")
    external override fun description(): String?
    
    @ObjCMethod("URLSession:downloadTask:didFinishDownloadingToURL:", "objcKniBridge584")
    external override fun URLSession(session: NSURLSession, downloadTask: NSURLSessionDownloadTask, didFinishDownloadingToURL: NSURL): Unit
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge586")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge588")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
    
    @ObjCMethod("debugDescription", "objcKniBridge590")
    external override fun debugDescription(): String?
    
    @ObjCMethod("URLSession:didBecomeInvalidWithError:", "objcKniBridge592")
    external override fun URLSession(session: NSURLSession, didBecomeInvalidWithError: NSError?): Unit
    
    @ObjCMethod("URLSession:didReceiveChallenge:completionHandler:", "objcKniBridge594")
    external override fun URLSession(session: NSURLSession, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit
    
    @ObjCMethod("URLSessionDidFinishEventsForBackgroundURLSession:", "objcKniBridge596")
    external override fun URLSessionDidFinishEventsForBackgroundURLSession(session: NSURLSession): Unit
    
    @ObjCMethod("URLSession:task:willBeginDelayedRequest:completionHandler:", "objcKniBridge598")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, willBeginDelayedRequest: NSURLRequest, completionHandler: (NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit): Unit
    
    @ObjCMethod("URLSession:taskIsWaitingForConnectivity:", "objcKniBridge600")
    external override fun URLSession(session: NSURLSession, taskIsWaitingForConnectivity: NSURLSessionTask): Unit
    
    @ObjCMethod("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:", "objcKniBridge602")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, willPerformHTTPRedirection: NSHTTPURLResponse, newRequest: NSURLRequest, completionHandler: (NSURLRequest?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:didReceiveChallenge:completionHandler:", "objcKniBridge604")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:needNewBodyStream:", "objcKniBridge606")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, needNewBodyStream: (NSInputStream?) -> Unit): Unit
    
    @ObjCMethod("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:", "objcKniBridge608")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didSendBodyData: int64_t, totalBytesSent: int64_t, totalBytesExpectedToSend: int64_t): Unit
    
    @ObjCMethod("URLSession:task:didFinishCollectingMetrics:", "objcKniBridge610")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didFinishCollectingMetrics: NSURLSessionTaskMetrics): Unit
    
    @ObjCMethod("URLSession:task:didCompleteWithError:", "objcKniBridge612")
    external override fun URLSession(session: NSURLSession, task: NSURLSessionTask, didCompleteWithError: NSError?): Unit
}

@ExternalObjCClass open class AFHTTPSessionManagerMeta : AFURLSessionManagerMeta, NSSecureCodingProtocolMeta, NSCopyingProtocolMeta {
    
    @ObjCMethod("manager", "objcKniBridge614")
    external open fun manager(): AFHTTPSessionManager
    
    @ObjCMethod("new", "objcKniBridge616")
    external override fun new(): AFHTTPSessionManager?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge618")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): AFHTTPSessionManager?
    
    @ObjCMethod("alloc", "objcKniBridge620")
    external override fun alloc(): AFHTTPSessionManager?
    
    @ObjCMethod("supportsSecureCoding", "objcKniBridge622")
    external override fun supportsSecureCoding(): Boolean
    
    protected constructor() {}
}

@ExternalObjCClass open class AFHTTPSessionManager : AFURLSessionManager, NSSecureCodingProtocol, NSCopyingProtocol {
    companion object : AFHTTPSessionManagerMeta(), ObjCClassOf<AFHTTPSessionManager> {}
    
    val baseURL: NSURL?
        get() = objcKniBridge648(nativeNullPtr, this.objcPtr())
    
    var requestSerializer: AFHTTPRequestSerializer
        get() = objcKniBridge650(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge652(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("initWithBaseURL:", "objcKniBridge624")
    external open fun initWithBaseURL(url: NSURL?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithBaseURL:", false)
    constructor(baseURL: NSURL?) {}
    
    @ObjCMethod("initWithBaseURL:sessionConfiguration:", "objcKniBridge626")
    external open fun initWithBaseURL(url: NSURL?, sessionConfiguration: NSURLSessionConfiguration?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithBaseURL:sessionConfiguration:", true)
    constructor(baseURL: NSURL?, sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("GET:parameters:success:failure:", "objcKniBridge628")
    external open fun GET(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("GET:parameters:progress:success:failure:", "objcKniBridge630")
    external open fun GET(URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("HEAD:parameters:success:failure:", "objcKniBridge632")
    external open fun HEAD(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:success:failure:", "objcKniBridge634")
    external open fun POST(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:progress:success:failure:", "objcKniBridge636")
    external open fun POST(URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:constructingBodyWithBlock:success:failure:", "objcKniBridge638")
    external open fun POST(URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("POST:parameters:constructingBodyWithBlock:progress:success:failure:", "objcKniBridge640")
    external open fun POST(URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("PUT:parameters:success:failure:", "objcKniBridge642")
    external open fun PUT(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("PATCH:parameters:success:failure:", "objcKniBridge644")
    external open fun PATCH(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("DELETE:parameters:success:failure:", "objcKniBridge646")
    external open fun DELETE(URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask?
    
    @ObjCMethod("baseURL", "objcKniBridge648")
    external open fun baseURL(): NSURL?
    
    @ObjCMethod("requestSerializer", "objcKniBridge650")
    external open fun requestSerializer(): AFHTTPRequestSerializer
    
    @ObjCMethod("setRequestSerializer:", "objcKniBridge652")
    external open fun setRequestSerializer(requestSerializer: AFHTTPRequestSerializer): Unit
    
    @ObjCMethod("responseSerializer", "objcKniBridge654")
    external override fun responseSerializer(): AFHTTPResponseSerializer
    
    @ObjCMethod("setResponseSerializer:", "objcKniBridge656")
    external override fun setResponseSerializer(responseSerializer: AFHTTPResponseSerializer): Unit
    
    @ObjCMethod("initWithSessionConfiguration:", "objcKniBridge658")
    external override fun initWithSessionConfiguration(configuration: NSURLSessionConfiguration?): AFHTTPSessionManager
    
    @ObjCConstructor("initWithSessionConfiguration:", false)
    constructor(sessionConfiguration: NSURLSessionConfiguration?) {}
    
    @ObjCMethod("init", "objcKniBridge660")
    external override fun init(): AFHTTPSessionManager?
    
    @ObjCConstructor("init", false)
    constructor() {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge662")
    external override fun initWithCoder(aDecoder: NSCoder): AFHTTPSessionManager?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("encodeWithCoder:", "objcKniBridge664")
    external override fun encodeWithCoder(aCoder: NSCoder): Unit
    
    @ObjCMethod("copyWithZone:", "objcKniBridge666")
    external override fun copyWithZone(zone: CPointer<NSZone>?): Any
}

const val AF_CAN_USE_AT_AVAILABLE: Int = 1

val AFURLResponseSerializationErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge798())!!

val AFNetworkingOperationFailingURLResponseErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge799())!!

val AFNetworkingOperationFailingURLResponseDataErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge800())!!

val UIGuidedAccessErrorDomain: NSErrorDomain?
    get() = interpretObjCPointerOrNull<String>(kniBridge801())

val AFURLRequestSerializationErrorDomain: String
    get() = interpretObjCPointerOrNull<String>(kniBridge802())!!

val AFNetworkingOperationFailingURLRequestErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge803())!!

val kAFUploadStream3GSuggestedPacketSize: NSUInteger
    get() = kniBridge804()

val kAFUploadStream3GSuggestedDelay: NSTimeInterval
    get() = kniBridge805()

val AFNetworkingReachabilityDidChangeNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge806())!!

val AFNetworkingReachabilityNotificationStatusItem: String
    get() = interpretObjCPointerOrNull<String>(kniBridge807())!!

val AFNetworkingTaskDidResumeNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge808())!!

val AFNetworkingTaskDidCompleteNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge809())!!

val AFNetworkingTaskDidSuspendNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge810())!!

val AFURLSessionDidInvalidateNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge811())!!

val AFURLSessionDownloadTaskDidFailToMoveFileNotification: String
    get() = interpretObjCPointerOrNull<String>(kniBridge812())!!

val AFNetworkingTaskDidCompleteResponseDataKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge813())!!

val AFNetworkingTaskDidCompleteSerializedResponseKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge814())!!

val AFNetworkingTaskDidCompleteResponseSerializerKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge815())!!

val AFNetworkingTaskDidCompleteAssetPathKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge816())!!

val AFNetworkingTaskDidCompleteErrorKey: String
    get() = interpretObjCPointerOrNull<String>(kniBridge817())!!

typealias UIGuidedAccessErrorCodeVar = LongVarOf<UIGuidedAccessErrorCode>
typealias UIGuidedAccessErrorCode = NSInteger

val UIGuidedAccessErrorPermissionDenied: UIGuidedAccessErrorCode get() = 0
val UIGuidedAccessErrorFailed: UIGuidedAccessErrorCode get() = 9223372036854775807

enum class UIGuidedAccessRestrictionState(override val value: NSInteger) : CEnum {
    UIGuidedAccessRestrictionStateAllow(0),
    UIGuidedAccessRestrictionStateDeny(1),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = UIGuidedAccessRestrictionState.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: UIGuidedAccessRestrictionState
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

typealias UIGuidedAccessAccessibilityFeatureVar = ULongVarOf<UIGuidedAccessAccessibilityFeature>
typealias UIGuidedAccessAccessibilityFeature = NSUInteger

val UIGuidedAccessAccessibilityFeatureVoiceOver: UIGuidedAccessAccessibilityFeature get() = 1u
val UIGuidedAccessAccessibilityFeatureZoom: UIGuidedAccessAccessibilityFeature get() = 2u
val UIGuidedAccessAccessibilityFeatureAssistiveTouch: UIGuidedAccessAccessibilityFeature get() = 4u
val UIGuidedAccessAccessibilityFeatureInvertColors: UIGuidedAccessAccessibilityFeature get() = 8u
val UIGuidedAccessAccessibilityFeatureGrayscaleDisplay: UIGuidedAccessAccessibilityFeature get() = 16u

typealias UIPencilPreferredActionVar = LongVarOf<UIPencilPreferredAction>
typealias UIPencilPreferredAction = NSInteger

val UIPencilPreferredActionIgnore: UIPencilPreferredAction get() = 0
val UIPencilPreferredActionSwitchEraser: UIPencilPreferredAction get() = 1
val UIPencilPreferredActionSwitchPrevious: UIPencilPreferredAction get() = 2
val UIPencilPreferredActionShowColorPalette: UIPencilPreferredAction get() = 3

typealias AFHTTPRequestQueryStringSerializationStyleVar = ULongVarOf<AFHTTPRequestQueryStringSerializationStyle>
typealias AFHTTPRequestQueryStringSerializationStyle = NSUInteger

val AFHTTPRequestQueryStringDefaultStyle: AFHTTPRequestQueryStringSerializationStyle get() = 0u

enum class AFSSLPinningMode(override val value: NSUInteger) : CEnum {
    AFSSLPinningModeNone(0u),
    AFSSLPinningModePublicKey(1u),
    AFSSLPinningModeCertificate(2u),
    ;
    
    companion object {
        fun byValue(value: NSUInteger) = AFSSLPinningMode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSUIntegerVar.size.toInt())
        var value: AFSSLPinningMode
            get() = byValue(this.reinterpret<NSUIntegerVar>().value)
            set(value) { this.reinterpret<NSUIntegerVar>().value = value.value }
    }
}

typealias AFNetworkReachabilityStatusVar = LongVarOf<AFNetworkReachabilityStatus>
typealias AFNetworkReachabilityStatus = NSInteger

val AFNetworkReachabilityStatusUnknown: AFNetworkReachabilityStatus get() = -1
val AFNetworkReachabilityStatusNotReachable: AFNetworkReachabilityStatus get() = 0
val AFNetworkReachabilityStatusReachableViaWWAN: AFNetworkReachabilityStatus get() = 1
val AFNetworkReachabilityStatusReachableViaWiFi: AFNetworkReachabilityStatus get() = 2

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseObjectForResponse:data:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking1")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr, response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge6(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking3")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLResponseSerializationProtocol? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(kniBridge8(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionWithIdentifier:didChangeState:", "v32@0:8@16q24", "knimi_com_afnetworking6")
internal fun objcKniBridge7(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit {
    return kniBridge10(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr(), didChangeState.value)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("textForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_afnetworking8")
internal fun objcKniBridge9(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge12(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("detailTextForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_afnetworking10")
internal fun objcKniBridge11(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge14(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionIdentifiers", "@16@0:8", "knimi_com_afnetworking12")
internal fun objcKniBridge13(kniSC: NativePtr, kniR: NativePtr): List<*>? {
    return interpretObjCPointerOrNull<List<*>>(kniBridge16(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("pencilInteractionDidTap:", "v24@0:8@16", "knimi_com_afnetworking15")
internal fun objcKniBridge16(kniSC: NativePtr, kniR: NativePtr, interaction: UIPencilInteraction): Unit {
    return kniBridge18(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, interaction.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestBySerializingRequest:withParameters:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking18")
internal fun objcKniBridge19(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest? {
    return interpretObjCPointerOrNull<NSURLRequest>(kniBridge20(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), withParameters.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking20")
internal fun objcKniBridge21(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLRequestSerializationProtocol? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLRequestSerializationProtocol>(kniBridge22(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileURL:name:error:", "B40@0:8@16@24^@32", "knimi_com_afnetworking23")
internal fun objcKniBridge24(kniSC: NativePtr, kniR: NativePtr, fileURL: NSURL, name: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge24(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fileURL.objcPtr(), name.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileURL:name:fileName:mimeType:error:", "B56@0:8@16@24@32@40^@48", "knimi_com_afnetworking25")
internal fun objcKniBridge26(kniSC: NativePtr, kniR: NativePtr, fileURL: NSURL, name: String, fileName: String, mimeType: String, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge26(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, fileURL.objcPtr(), name.objcPtr(), fileName.objcPtr(), mimeType.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithInputStream:name:fileName:length:mimeType:", "v56@0:8@16@24@32q40@48", "knimi_com_afnetworking27")
internal fun objcKniBridge28(kniSC: NativePtr, kniR: NativePtr, inputStream: NSInputStream?, name: String, fileName: String, length: int64_t, mimeType: String): Unit {
    return kniBridge28(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, inputStream.objcPtr(), name.objcPtr(), fileName.objcPtr(), length, mimeType.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFileData:name:fileName:mimeType:", "v48@0:8@16@24@32@40", "knimi_com_afnetworking29")
internal fun objcKniBridge30(kniSC: NativePtr, kniR: NativePtr, data: NSData, name: String, fileName: String, mimeType: String): Unit {
    return kniBridge30(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), name.objcPtr(), fileName.objcPtr(), mimeType.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithFormData:name:", "v32@0:8@16@24", "knimi_com_afnetworking31")
internal fun objcKniBridge32(kniSC: NativePtr, kniR: NativePtr, data: NSData, name: String): Unit {
    return kniBridge32(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, data.objcPtr(), name.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appendPartWithHeaders:body:", "v32@0:8@16@24", "knimi_com_afnetworking33")
internal fun objcKniBridge34(kniSC: NativePtr, kniR: NativePtr, headers: Map<Any?, *>?, body: NSData): Unit {
    return kniBridge34(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, headers.objcPtr(), body.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("throttleBandwidthWithPacketSize:delay:", "v32@0:8Q16d24", "knimi_com_afnetworking35")
internal fun objcKniBridge36(kniSC: NativePtr, kniR: NativePtr, numberOfBytes: NSUInteger, delay: NSTimeInterval): Unit {
    return kniBridge36(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, numberOfBytes, delay)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking37")
internal fun objcKniBridge38(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge38(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking39")
internal fun objcKniBridge40(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge40(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking41")
internal fun objcKniBridge42(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge42(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking43")
internal fun objcKniBridge44(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer? {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge44(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking45")
internal fun objcKniBridge46(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge46(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking47")
internal fun objcKniBridge48(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge48(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("validateResponse:data:error:", "B40@0:8@16@24^@32", "knimi_com_afnetworking49")
internal fun objcKniBridge50(kniSC: NativePtr, kniR: NativePtr, response: NSHTTPURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Boolean {
    return kniBridge50(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stringEncoding", "Q16@0:8", "knimi_com_afnetworking51")
internal fun objcKniBridge52(kniSC: NativePtr, kniR: NativePtr): NSStringEncoding {
    return kniBridge52(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setStringEncoding:", "v24@0:8Q16", "knimi_com_afnetworking53")
internal fun objcKniBridge54(kniSC: NativePtr, kniR: NativePtr, stringEncoding: NSStringEncoding): Unit {
    return kniBridge54(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, stringEncoding)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("acceptableStatusCodes", "@16@0:8", "knimi_com_afnetworking55")
internal fun objcKniBridge56(kniSC: NativePtr, kniR: NativePtr): NSIndexSet? {
    return interpretObjCPointerOrNull<NSIndexSet>(kniBridge56(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAcceptableStatusCodes:", "v24@0:8@16", "knimi_com_afnetworking57")
internal fun objcKniBridge58(kniSC: NativePtr, kniR: NativePtr, acceptableStatusCodes: NSIndexSet?): Unit {
    return kniBridge58(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, acceptableStatusCodes.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("acceptableContentTypes", "@16@0:8", "knimi_com_afnetworking59")
internal fun objcKniBridge60(kniSC: NativePtr, kniR: NativePtr): Set<*>? {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge60(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAcceptableContentTypes:", "v24@0:8@16", "knimi_com_afnetworking61")
internal fun objcKniBridge62(kniSC: NativePtr, kniR: NativePtr, acceptableContentTypes: Set<*>?): Unit {
    return kniBridge62(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, acceptableContentTypes.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking63")
internal fun objcKniBridge64(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge64(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseObjectForResponse:data:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking65")
internal fun objcKniBridge66(kniSC: NativePtr, kniR: NativePtr, response: NSURLResponse?, data: NSData?, error: CPointer<ObjCObjectVar<NSError?>>?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge66(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, response.objcPtr(), data.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking67")
internal fun objcKniBridge68(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge68(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking69")
internal fun objcKniBridge70(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge70(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking71")
internal fun objcKniBridge72(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge72(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking73")
internal fun objcKniBridge74(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge74(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking75")
internal fun objcKniBridge76(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge76(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking77")
internal fun objcKniBridge78(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge78(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking79")
internal fun objcKniBridge80(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge80(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking81")
internal fun objcKniBridge82(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge82(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking83")
internal fun objcKniBridge84(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge84(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking85")
internal fun objcKniBridge86(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge86(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking87")
internal fun objcKniBridge88(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge88(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking89")
internal fun objcKniBridge90(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge90(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking91")
internal fun objcKniBridge92(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge92(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking93")
internal fun objcKniBridge94(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge94(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking95")
internal fun objcKniBridge96(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge96(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking97")
internal fun objcKniBridge98(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge98(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithReadingOptions:", "@24@0:8Q16", "knimi_com_afnetworking99")
internal fun objcKniBridge100(kniSC: NativePtr, kniR: NativePtr, readingOptions: NSJSONReadingOptions): AFJSONResponseSerializer {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge100(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readingOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking101")
internal fun objcKniBridge102(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge102(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking103")
internal fun objcKniBridge104(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge104(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking105")
internal fun objcKniBridge106(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge106(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking107")
internal fun objcKniBridge108(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer? {
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge108(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("readingOptions", "Q16@0:8", "knimi_com_afnetworking109")
internal fun objcKniBridge110(kniSC: NativePtr, kniR: NativePtr): NSJSONReadingOptions {
    return kniBridge110(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReadingOptions:", "v24@0:8Q16", "knimi_com_afnetworking111")
internal fun objcKniBridge112(kniSC: NativePtr, kniR: NativePtr, readingOptions: NSJSONReadingOptions): Unit {
    return kniBridge112(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readingOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("removesKeysWithNullValues", "B16@0:8", "knimi_com_afnetworking113")
internal fun objcKniBridge114(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge114(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setRemovesKeysWithNullValues:", "v20@0:8B16", "knimi_com_afnetworking115")
internal fun objcKniBridge116(kniSC: NativePtr, kniR: NativePtr, removesKeysWithNullValues: Boolean): Unit {
    return kniBridge116(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, removesKeysWithNullValues.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking117")
internal fun objcKniBridge118(kniSC: NativePtr, kniR: NativePtr): AFJSONResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge118(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking119")
internal fun objcKniBridge120(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFJSONResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONResponseSerializer>(kniBridge120(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking121")
internal fun objcKniBridge122(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge122(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking123")
internal fun objcKniBridge124(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge124(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking125")
internal fun objcKniBridge126(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge126(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking127")
internal fun objcKniBridge128(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer? {
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge128(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking129")
internal fun objcKniBridge130(kniSC: NativePtr, kniR: NativePtr): AFXMLParserResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge130(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking131")
internal fun objcKniBridge132(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFXMLParserResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFXMLParserResponseSerializer>(kniBridge132(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithFormat:readOptions:", "@32@0:8Q16Q24", "knimi_com_afnetworking133")
internal fun objcKniBridge134(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat, readOptions: NSPropertyListReadOptions): AFPropertyListResponseSerializer {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge134(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format, readOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking135")
internal fun objcKniBridge136(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge136(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking137")
internal fun objcKniBridge138(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge138(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking139")
internal fun objcKniBridge140(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge140(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking141")
internal fun objcKniBridge142(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge142(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("format", "Q16@0:8", "knimi_com_afnetworking143")
internal fun objcKniBridge144(kniSC: NativePtr, kniR: NativePtr): NSPropertyListFormat {
    return kniBridge144(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setFormat:", "v24@0:8Q16", "knimi_com_afnetworking145")
internal fun objcKniBridge146(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat): Unit {
    return kniBridge146(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("readOptions", "Q16@0:8", "knimi_com_afnetworking147")
internal fun objcKniBridge148(kniSC: NativePtr, kniR: NativePtr): NSPropertyListReadOptions {
    return kniBridge148(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReadOptions:", "v24@0:8Q16", "knimi_com_afnetworking149")
internal fun objcKniBridge150(kniSC: NativePtr, kniR: NativePtr, readOptions: NSPropertyListReadOptions): Unit {
    return kniBridge150(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, readOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking151")
internal fun objcKniBridge152(kniSC: NativePtr, kniR: NativePtr): AFPropertyListResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge152(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking153")
internal fun objcKniBridge154(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFPropertyListResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListResponseSerializer>(kniBridge154(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking155")
internal fun objcKniBridge156(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge156(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking157")
internal fun objcKniBridge158(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge158(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking159")
internal fun objcKniBridge160(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge160(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking161")
internal fun objcKniBridge162(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer? {
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge162(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("imageScale", "d16@0:8", "knimi_com_afnetworking163")
internal fun objcKniBridge164(kniSC: NativePtr, kniR: NativePtr): CGFloat {
    return kniBridge164(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setImageScale:", "v24@0:8d16", "knimi_com_afnetworking165")
internal fun objcKniBridge166(kniSC: NativePtr, kniR: NativePtr, imageScale: CGFloat): Unit {
    return kniBridge166(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, imageScale)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("automaticallyInflatesResponseImage", "B16@0:8", "knimi_com_afnetworking167")
internal fun objcKniBridge168(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge168(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAutomaticallyInflatesResponseImage:", "v20@0:8B16", "knimi_com_afnetworking169")
internal fun objcKniBridge170(kniSC: NativePtr, kniR: NativePtr, automaticallyInflatesResponseImage: Boolean): Unit {
    return kniBridge170(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, automaticallyInflatesResponseImage.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking171")
internal fun objcKniBridge172(kniSC: NativePtr, kniR: NativePtr): AFImageResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge172(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking173")
internal fun objcKniBridge174(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFImageResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFImageResponseSerializer>(kniBridge174(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("compoundSerializerWithResponseSerializers:", "@24@0:8@16", "knimi_com_afnetworking175")
internal fun objcKniBridge176(kniSC: NativePtr, kniR: NativePtr, responseSerializers: List<*>): AFCompoundResponseSerializer {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge176(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializers.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking177")
internal fun objcKniBridge178(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge178(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking179")
internal fun objcKniBridge180(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge180(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking181")
internal fun objcKniBridge182(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge182(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking183")
internal fun objcKniBridge184(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer? {
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge184(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializers", "@16@0:8", "knimi_com_afnetworking185")
internal fun objcKniBridge186(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge186(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking187")
internal fun objcKniBridge188(kniSC: NativePtr, kniR: NativePtr): AFCompoundResponseSerializer {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge188(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking189")
internal fun objcKniBridge190(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFCompoundResponseSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFCompoundResponseSerializer>(kniBridge190(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("preferredTapAction", "q16@0:8", "knimi_com_afnetworking191")
internal fun objcKniBridge192(kniSC: NativePtr, kniR: NativePtr): UIPencilPreferredAction {
    return kniBridge192(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking193")
internal fun objcKniBridge194(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge194(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking195")
internal fun objcKniBridge196(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge196(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking197")
internal fun objcKniBridge198(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge198(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("delegate", "@16@0:8", "knimi_com_afnetworking199")
internal fun objcKniBridge200(kniSC: NativePtr, kniR: NativePtr): UIPencilInteractionDelegateProtocol? {
    return interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(kniBridge200(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDelegate:", "v24@0:8@16", "knimi_com_afnetworking201")
internal fun objcKniBridge202(kniSC: NativePtr, kniR: NativePtr, delegate: UIPencilInteractionDelegateProtocol?): Unit {
    return kniBridge202(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, delegate.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEnabled", "B16@0:8", "knimi_com_afnetworking203")
internal fun objcKniBridge204(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge204(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setEnabled:", "v20@0:8B16", "knimi_com_afnetworking205")
internal fun objcKniBridge206(kniSC: NativePtr, kniR: NativePtr, enabled: Boolean): Unit {
    return kniBridge206(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, enabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking207")
internal fun objcKniBridge208(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge208(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("willMoveToView:", "v24@0:8@16", "knimi_com_afnetworking209")
internal fun objcKniBridge210(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge210(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("didMoveToView:", "v24@0:8@16", "knimi_com_afnetworking211")
internal fun objcKniBridge212(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge212(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("view", "@16@0:8", "knimi_com_afnetworking213")
internal fun objcKniBridge214(kniSC: NativePtr, kniR: NativePtr): UIView? {
    return interpretObjCPointerOrNull<UIView>(kniBridge214(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking215")
internal fun objcKniBridge216(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge216(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking217")
internal fun objcKniBridge218(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge218(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking219")
internal fun objcKniBridge220(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge220(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking221")
internal fun objcKniBridge222(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge222(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking223")
internal fun objcKniBridge224(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge224(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking225")
internal fun objcKniBridge226(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge226(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking227")
internal fun objcKniBridge228(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge228(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking229")
internal fun objcKniBridge230(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge230(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking231")
internal fun objcKniBridge232(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge232(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking233")
internal fun objcKniBridge234(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge234(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking235")
internal fun objcKniBridge236(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge236(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking237")
internal fun objcKniBridge238(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge238(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking239")
internal fun objcKniBridge240(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge240(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking241")
internal fun objcKniBridge242(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge242(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking243")
internal fun objcKniBridge244(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge244(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking245")
internal fun objcKniBridge246(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge246(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking247")
internal fun objcKniBridge248(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge248(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking249")
internal fun objcKniBridge250(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge250(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking251")
internal fun objcKniBridge252(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge252(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValue:forHTTPHeaderField:", "v32@0:8@16@24", "knimi_com_afnetworking253")
internal fun objcKniBridge254(kniSC: NativePtr, kniR: NativePtr, value: String?, forHTTPHeaderField: String): Unit {
    return kniBridge254(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, value.objcPtr(), forHTTPHeaderField.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("valueForHTTPHeaderField:", "@24@0:8@16", "knimi_com_afnetworking255")
internal fun objcKniBridge256(kniSC: NativePtr, kniR: NativePtr, field: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge256(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, field.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAuthorizationHeaderFieldWithUsername:password:", "v32@0:8@16@24", "knimi_com_afnetworking257")
internal fun objcKniBridge258(kniSC: NativePtr, kniR: NativePtr, username: String, password: String): Unit {
    return kniBridge258(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, username.objcPtr(), password.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("clearAuthorizationHeader", "v16@0:8", "knimi_com_afnetworking259")
internal fun objcKniBridge260(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge260(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setQueryStringSerializationWithStyle:", "v24@0:8Q16", "knimi_com_afnetworking261")
internal fun objcKniBridge262(kniSC: NativePtr, kniR: NativePtr, style: AFHTTPRequestQueryStringSerializationStyle): Unit {
    return kniBridge262(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, style)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setQueryStringSerializationWithBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking263")
internal fun objcKniBridge264(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?)?): Unit {
    return kniBridge264(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestWithMethod:URLString:parameters:error:", "@48@0:8@16@24@32^@40", "knimi_com_afnetworking265")
internal fun objcKniBridge266(kniSC: NativePtr, kniR: NativePtr, method: String, URLString: String, parameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge268(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, method.objcPtr(), URLString.objcPtr(), parameters.objcPtr(), error.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("multipartFormRequestWithMethod:URLString:parameters:constructingBodyWithBlock:error:", "@56@0:8@16@24@32@\u003F40^@48", "knimi_com_afnetworking267")
internal fun objcKniBridge268(kniSC: NativePtr, kniR: NativePtr, method: String, URLString: String, parameters: Map<Any?, *>?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, error: CPointer<ObjCObjectVar<NSError?>>?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge270(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, method.objcPtr(), URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), error.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestWithMultipartFormRequest:writingStreamContentsToFile:completionHandler:", "@40@0:8@16@24@\u003F32", "knimi_com_afnetworking269")
internal fun objcKniBridge270(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, writingStreamContentsToFile: NSURL, completionHandler: ((NSError?) -> Unit)?): NSMutableURLRequest {
    return interpretObjCPointerOrNull<NSMutableURLRequest>(kniBridge274(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), writingStreamContentsToFile.objcPtr(), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stringEncoding", "Q16@0:8", "knimi_com_afnetworking271")
internal fun objcKniBridge272(kniSC: NativePtr, kniR: NativePtr): NSStringEncoding {
    return kniBridge278(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setStringEncoding:", "v24@0:8Q16", "knimi_com_afnetworking273")
internal fun objcKniBridge274(kniSC: NativePtr, kniR: NativePtr, stringEncoding: NSStringEncoding): Unit {
    return kniBridge280(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, stringEncoding)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowsCellularAccess", "B16@0:8", "knimi_com_afnetworking275")
internal fun objcKniBridge276(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge282(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowsCellularAccess:", "v20@0:8B16", "knimi_com_afnetworking277")
internal fun objcKniBridge278(kniSC: NativePtr, kniR: NativePtr, allowsCellularAccess: Boolean): Unit {
    return kniBridge284(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowsCellularAccess.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("cachePolicy", "Q16@0:8", "knimi_com_afnetworking279")
internal fun objcKniBridge280(kniSC: NativePtr, kniR: NativePtr): NSURLRequestCachePolicy {
    return kniBridge286(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCachePolicy:", "v24@0:8Q16", "knimi_com_afnetworking281")
internal fun objcKniBridge282(kniSC: NativePtr, kniR: NativePtr, cachePolicy: NSURLRequestCachePolicy): Unit {
    return kniBridge288(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, cachePolicy)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPShouldHandleCookies", "B16@0:8", "knimi_com_afnetworking283")
internal fun objcKniBridge284(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge290(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPShouldHandleCookies:", "v20@0:8B16", "knimi_com_afnetworking285")
internal fun objcKniBridge286(kniSC: NativePtr, kniR: NativePtr, HTTPShouldHandleCookies: Boolean): Unit {
    return kniBridge292(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPShouldHandleCookies.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPShouldUsePipelining", "B16@0:8", "knimi_com_afnetworking287")
internal fun objcKniBridge288(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge294(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPShouldUsePipelining:", "v20@0:8B16", "knimi_com_afnetworking289")
internal fun objcKniBridge290(kniSC: NativePtr, kniR: NativePtr, HTTPShouldUsePipelining: Boolean): Unit {
    return kniBridge296(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPShouldUsePipelining.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("networkServiceType", "Q16@0:8", "knimi_com_afnetworking291")
internal fun objcKniBridge292(kniSC: NativePtr, kniR: NativePtr): NSURLRequestNetworkServiceType {
    return kniBridge298(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setNetworkServiceType:", "v24@0:8Q16", "knimi_com_afnetworking293")
internal fun objcKniBridge294(kniSC: NativePtr, kniR: NativePtr, networkServiceType: NSURLRequestNetworkServiceType): Unit {
    return kniBridge300(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, networkServiceType)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("timeoutInterval", "d16@0:8", "knimi_com_afnetworking295")
internal fun objcKniBridge296(kniSC: NativePtr, kniR: NativePtr): NSTimeInterval {
    return kniBridge302(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTimeoutInterval:", "v24@0:8d16", "knimi_com_afnetworking297")
internal fun objcKniBridge298(kniSC: NativePtr, kniR: NativePtr, timeoutInterval: NSTimeInterval): Unit {
    return kniBridge304(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, timeoutInterval)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPRequestHeaders", "@16@0:8", "knimi_com_afnetworking299")
internal fun objcKniBridge300(kniSC: NativePtr, kniR: NativePtr): Map<Any?, *> {
    return interpretObjCPointerOrNull<Map<Any?, *>>(kniBridge306(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HTTPMethodsEncodingParametersInURI", "@16@0:8", "knimi_com_afnetworking301")
internal fun objcKniBridge302(kniSC: NativePtr, kniR: NativePtr): Set<*> {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge308(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHTTPMethodsEncodingParametersInURI:", "v24@0:8@16", "knimi_com_afnetworking303")
internal fun objcKniBridge304(kniSC: NativePtr, kniR: NativePtr, HTTPMethodsEncodingParametersInURI: Set<*>): Unit {
    return kniBridge310(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, HTTPMethodsEncodingParametersInURI.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking305")
internal fun objcKniBridge306(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge312(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking307")
internal fun objcKniBridge308(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge314(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestBySerializingRequest:withParameters:error:", "@40@0:8@16@24^@32", "knimi_com_afnetworking309")
internal fun objcKniBridge310(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, withParameters: Any?, error: CPointer<ObjCObjectVar<NSError?>>?): NSURLRequest? {
    return interpretObjCPointerOrNull<NSURLRequest>(kniBridge316(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), withParameters.objcPtr(), error.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking311")
internal fun objcKniBridge312(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge318(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking313")
internal fun objcKniBridge314(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge320(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking315")
internal fun objcKniBridge316(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge322(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking317")
internal fun objcKniBridge318(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge324(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking319")
internal fun objcKniBridge320(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge326(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking321")
internal fun objcKniBridge322(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge328(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking323")
internal fun objcKniBridge324(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge330(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking325")
internal fun objcKniBridge326(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge332(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking327")
internal fun objcKniBridge328(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge334(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking329")
internal fun objcKniBridge330(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge336(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking331")
internal fun objcKniBridge332(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge338(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking333")
internal fun objcKniBridge334(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge340(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking335")
internal fun objcKniBridge336(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge342(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking337")
internal fun objcKniBridge338(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge344(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking339")
internal fun objcKniBridge340(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge346(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking341")
internal fun objcKniBridge342(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge348(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithWritingOptions:", "@24@0:8Q16", "knimi_com_afnetworking343")
internal fun objcKniBridge344(kniSC: NativePtr, kniR: NativePtr, writingOptions: NSJSONWritingOptions): AFJSONRequestSerializer {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge350(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writingOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking345")
internal fun objcKniBridge346(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge352(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking347")
internal fun objcKniBridge348(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge354(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking349")
internal fun objcKniBridge350(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge356(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking351")
internal fun objcKniBridge352(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge358(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("writingOptions", "Q16@0:8", "knimi_com_afnetworking353")
internal fun objcKniBridge354(kniSC: NativePtr, kniR: NativePtr): NSJSONWritingOptions {
    return kniBridge360(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setWritingOptions:", "v24@0:8Q16", "knimi_com_afnetworking355")
internal fun objcKniBridge356(kniSC: NativePtr, kniR: NativePtr, writingOptions: NSJSONWritingOptions): Unit {
    return kniBridge362(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writingOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking357")
internal fun objcKniBridge358(kniSC: NativePtr, kniR: NativePtr): AFJSONRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge364(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking359")
internal fun objcKniBridge360(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFJSONRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFJSONRequestSerializer>(kniBridge366(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializerWithFormat:writeOptions:", "@32@0:8Q16Q24", "knimi_com_afnetworking361")
internal fun objcKniBridge362(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat, writeOptions: NSPropertyListWriteOptions): AFPropertyListRequestSerializer {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge368(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format, writeOptions))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("serializer", "@16@0:8", "knimi_com_afnetworking363")
internal fun objcKniBridge364(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge370(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking365")
internal fun objcKniBridge366(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge372(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking367")
internal fun objcKniBridge368(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge374(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking369")
internal fun objcKniBridge370(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge376(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("format", "Q16@0:8", "knimi_com_afnetworking371")
internal fun objcKniBridge372(kniSC: NativePtr, kniR: NativePtr): NSPropertyListFormat {
    return kniBridge378(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setFormat:", "v24@0:8Q16", "knimi_com_afnetworking373")
internal fun objcKniBridge374(kniSC: NativePtr, kniR: NativePtr, format: NSPropertyListFormat): Unit {
    return kniBridge380(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, format)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("writeOptions", "Q16@0:8", "knimi_com_afnetworking375")
internal fun objcKniBridge376(kniSC: NativePtr, kniR: NativePtr): NSPropertyListWriteOptions {
    return kniBridge382(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setWriteOptions:", "v24@0:8Q16", "knimi_com_afnetworking377")
internal fun objcKniBridge378(kniSC: NativePtr, kniR: NativePtr, writeOptions: NSPropertyListWriteOptions): Unit {
    return kniBridge384(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, writeOptions)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking379")
internal fun objcKniBridge380(kniSC: NativePtr, kniR: NativePtr): AFPropertyListRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge386(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking381")
internal fun objcKniBridge382(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFPropertyListRequestSerializer? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFPropertyListRequestSerializer>(kniBridge388(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("certificatesInBundle:", "@24@0:8@16", "knimi_com_afnetworking383")
internal fun objcKniBridge384(kniSC: NativePtr, kniR: NativePtr, bundle: NSBundle): Set<*> {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge390(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, bundle.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("defaultPolicy", "@16@0:8", "knimi_com_afnetworking385")
internal fun objcKniBridge386(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge392(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("policyWithPinningMode:", "@24@0:8Q16", "knimi_com_afnetworking387")
internal fun objcKniBridge388(kniSC: NativePtr, kniR: NativePtr, pinningMode: AFSSLPinningMode): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge394(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinningMode.value))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("policyWithPinningMode:withPinnedCertificates:", "@32@0:8Q16@24", "knimi_com_afnetworking389")
internal fun objcKniBridge390(kniSC: NativePtr, kniR: NativePtr, pinningMode: AFSSLPinningMode, withPinnedCertificates: Set<*>): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge396(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinningMode.value, withPinnedCertificates.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking391")
internal fun objcKniBridge392(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge398(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking393")
internal fun objcKniBridge394(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge400(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking395")
internal fun objcKniBridge396(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge402(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking397")
internal fun objcKniBridge398(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge404(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("evaluateServerTrust:forDomain:", "B32@0:8^{__SecTrust=}16@24", "knimi_com_afnetworking399")
internal fun objcKniBridge400(kniSC: NativePtr, kniR: NativePtr, serverTrust: SecTrustRef?, forDomain: String?): Boolean {
    return kniBridge406(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, serverTrust.rawValue, forDomain.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("SSLPinningMode", "Q16@0:8", "knimi_com_afnetworking401")
internal fun objcKniBridge402(kniSC: NativePtr, kniR: NativePtr): AFSSLPinningMode {
    return AFSSLPinningMode.byValue(kniBridge408(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("pinnedCertificates", "@16@0:8", "knimi_com_afnetworking403")
internal fun objcKniBridge404(kniSC: NativePtr, kniR: NativePtr): Set<*>? {
    return interpretObjCPointerOrNull<Set<*>>(kniBridge410(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setPinnedCertificates:", "v24@0:8@16", "knimi_com_afnetworking405")
internal fun objcKniBridge406(kniSC: NativePtr, kniR: NativePtr, pinnedCertificates: Set<*>?): Unit {
    return kniBridge412(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, pinnedCertificates.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allowInvalidCertificates", "B16@0:8", "knimi_com_afnetworking407")
internal fun objcKniBridge408(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge414(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAllowInvalidCertificates:", "v20@0:8B16", "knimi_com_afnetworking409")
internal fun objcKniBridge410(kniSC: NativePtr, kniR: NativePtr, allowInvalidCertificates: Boolean): Unit {
    return kniBridge416(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, allowInvalidCertificates.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("validatesDomainName", "B16@0:8", "knimi_com_afnetworking411")
internal fun objcKniBridge412(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge418(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setValidatesDomainName:", "v20@0:8B16", "knimi_com_afnetworking413")
internal fun objcKniBridge414(kniSC: NativePtr, kniR: NativePtr, validatesDomainName: Boolean): Unit {
    return kniBridge420(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, validatesDomainName.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking415")
internal fun objcKniBridge416(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge422(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking417")
internal fun objcKniBridge418(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFSecurityPolicy? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge424(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking419")
internal fun objcKniBridge420(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge426(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking421")
internal fun objcKniBridge422(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge428(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("sharedManager", "@16@0:8", "knimi_com_afnetworking423")
internal fun objcKniBridge424(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge430(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("manager", "@16@0:8", "knimi_com_afnetworking425")
internal fun objcKniBridge426(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge432(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managerForDomain:", "@24@0:8@16", "knimi_com_afnetworking427")
internal fun objcKniBridge428(kniSC: NativePtr, kniR: NativePtr, domain: String): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge434(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, domain.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("managerForAddress:", "@24@0:8r^v16", "knimi_com_afnetworking429")
internal fun objcKniBridge430(kniSC: NativePtr, kniR: NativePtr, address: COpaquePointer?): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge436(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, address.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking431")
internal fun objcKniBridge432(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge438(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking433")
internal fun objcKniBridge434(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge440(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking435")
internal fun objcKniBridge436(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge442(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithReachability:", "@24@0:8r^{__SCNetworkReachability=}16", "knimi_com_afnetworking437")
internal fun objcKniBridge438(kniSC: NativePtr, kniR: NativePtr, reachability: SCNetworkReachabilityRef?): AFNetworkReachabilityManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge444(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, reachability.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("startMonitoring", "v16@0:8", "knimi_com_afnetworking439")
internal fun objcKniBridge440(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge446(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("stopMonitoring", "v16@0:8", "knimi_com_afnetworking441")
internal fun objcKniBridge442(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge448(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("localizedNetworkReachabilityStatusString", "@16@0:8", "knimi_com_afnetworking443")
internal fun objcKniBridge444(kniSC: NativePtr, kniR: NativePtr): String {
    return interpretObjCPointerOrNull<String>(kniBridge450(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReachabilityStatusChangeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking445")
internal fun objcKniBridge446(kniSC: NativePtr, kniR: NativePtr, block: ((AFNetworkReachabilityStatus) -> Unit)?): Unit {
    return kniBridge452(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("networkReachabilityStatus", "q16@0:8", "knimi_com_afnetworking447")
internal fun objcKniBridge448(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityStatus {
    return kniBridge456(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachable", "B16@0:8", "knimi_com_afnetworking449")
internal fun objcKniBridge450(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge458(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachableViaWWAN", "B16@0:8", "knimi_com_afnetworking451")
internal fun objcKniBridge452(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge460(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isReachableViaWiFi", "B16@0:8", "knimi_com_afnetworking453")
internal fun objcKniBridge454(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge462(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking455")
internal fun objcKniBridge456(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge464(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking457")
internal fun objcKniBridge458(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge466(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking459")
internal fun objcKniBridge460(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge468(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking461")
internal fun objcKniBridge462(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge470(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking463")
internal fun objcKniBridge464(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge472(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithSessionConfiguration:", "@24@0:8@16", "knimi_com_afnetworking465")
internal fun objcKniBridge466(kniSC: NativePtr, kniR: NativePtr, configuration: NSURLSessionConfiguration?): AFURLSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge474(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, configuration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("invalidateSessionCancelingTasks:", "v20@0:8B16", "knimi_com_afnetworking467")
internal fun objcKniBridge468(kniSC: NativePtr, kniR: NativePtr, cancelPendingTasks: Boolean): Unit {
    return kniBridge476(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, cancelPendingTasks.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTaskWithRequest:completionHandler:", "@32@0:8@16@\u003F24", "knimi_com_afnetworking469")
internal fun objcKniBridge470(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge478(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTaskWithRequest:uploadProgress:downloadProgress:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking471")
internal fun objcKniBridge472(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, uploadProgress: ((NSProgress?) -> Unit)?, downloadProgress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionDataTask {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge482(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(uploadProgress), createKotlinObjectHolder(downloadProgress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithRequest:fromFile:progress:completionHandler:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking473")
internal fun objcKniBridge474(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, fromFile: NSURL, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge490(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), fromFile.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithRequest:fromData:progress:completionHandler:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking475")
internal fun objcKniBridge476(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, fromData: NSData?, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge496(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), fromData.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTaskWithStreamedRequest:progress:completionHandler:", "@40@0:8@16@\u003F24@\u003F32", "knimi_com_afnetworking477")
internal fun objcKniBridge478(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, completionHandler: ((NSURLResponse?, Any?, NSError?) -> Unit)?): NSURLSessionUploadTask {
    return interpretObjCPointerOrNull<NSURLSessionUploadTask>(kniBridge502(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTaskWithRequest:progress:destination:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking479")
internal fun objcKniBridge480(kniSC: NativePtr, kniR: NativePtr, request: NSURLRequest, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask {
    return interpretObjCPointerOrNull<NSURLSessionDownloadTask>(kniBridge508(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, request.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(destination), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTaskWithResumeData:progress:destination:completionHandler:", "@48@0:8@16@\u003F24@\u003F32@\u003F40", "knimi_com_afnetworking481")
internal fun objcKniBridge482(kniSC: NativePtr, kniR: NativePtr, resumeData: NSData, progress: ((NSProgress?) -> Unit)?, destination: ((NSURL?, NSURLResponse?) -> NSURL?)?, completionHandler: ((NSURLResponse?, NSURL?, NSError?) -> Unit)?): NSURLSessionDownloadTask {
    return interpretObjCPointerOrNull<NSURLSessionDownloadTask>(kniBridge516(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, resumeData.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(destination), createKotlinObjectHolder(completionHandler)))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadProgressForTask:", "@24@0:8@16", "knimi_com_afnetworking483")
internal fun objcKniBridge484(kniSC: NativePtr, kniR: NativePtr, task: NSURLSessionTask): NSProgress? {
    return interpretObjCPointerOrNull<NSProgress>(kniBridge524(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, task.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadProgressForTask:", "@24@0:8@16", "knimi_com_afnetworking485")
internal fun objcKniBridge486(kniSC: NativePtr, kniR: NativePtr, task: NSURLSessionTask): NSProgress? {
    return interpretObjCPointerOrNull<NSProgress>(kniBridge526(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, task.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSessionDidBecomeInvalidBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking487")
internal fun objcKniBridge488(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSError?) -> Unit)?): Unit {
    return kniBridge528(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSessionDidReceiveAuthenticationChallengeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking489")
internal fun objcKniBridge490(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit {
    return kniBridge532(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskNeedNewBodyStreamBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking491")
internal fun objcKniBridge492(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?) -> NSInputStream?)?): Unit {
    return kniBridge536(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskWillPerformHTTPRedirectionBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking493")
internal fun objcKniBridge494(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?)?): Unit {
    return kniBridge540(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidReceiveAuthenticationChallengeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking495")
internal fun objcKniBridge496(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition)?): Unit {
    return kniBridge544(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidSendBodyDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking497")
internal fun objcKniBridge498(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge548(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTaskDidCompleteBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking499")
internal fun objcKniBridge500(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionTask?, NSError?) -> Unit)?): Unit {
    return kniBridge552(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidReceiveResponseBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking501")
internal fun objcKniBridge502(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition)?): Unit {
    return kniBridge556(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidBecomeDownloadTaskBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking503")
internal fun objcKniBridge504(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit)?): Unit {
    return kniBridge560(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskDidReceiveDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking505")
internal fun objcKniBridge506(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit)?): Unit {
    return kniBridge564(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDataTaskWillCacheResponseBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking507")
internal fun objcKniBridge508(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?)?): Unit {
    return kniBridge568(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDidFinishEventsForBackgroundURLSessionBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking509")
internal fun objcKniBridge510(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?) -> Unit)?): Unit {
    return kniBridge572(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidFinishDownloadingBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking511")
internal fun objcKniBridge512(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?)?): Unit {
    return kniBridge576(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidWriteDataBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking513")
internal fun objcKniBridge514(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge580(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDownloadTaskDidResumeBlock:", "v24@0:8@\u003F16", "knimi_com_afnetworking515")
internal fun objcKniBridge516(kniSC: NativePtr, kniR: NativePtr, block: ((NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit)?): Unit {
    return kniBridge584(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, createKotlinObjectHolder(block))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("session", "@16@0:8", "knimi_com_afnetworking517")
internal fun objcKniBridge518(kniSC: NativePtr, kniR: NativePtr): NSURLSession {
    return interpretObjCPointerOrNull<NSURLSession>(kniBridge588(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("operationQueue", "@16@0:8", "knimi_com_afnetworking519")
internal fun objcKniBridge520(kniSC: NativePtr, kniR: NativePtr): NSOperationQueue {
    return interpretObjCPointerOrNull<NSOperationQueue>(kniBridge590(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializer", "@16@0:8", "knimi_com_afnetworking521")
internal fun objcKniBridge522(kniSC: NativePtr, kniR: NativePtr): AFURLResponseSerializationProtocol {
    return interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(kniBridge592(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setResponseSerializer:", "v24@0:8@16", "knimi_com_afnetworking523")
internal fun objcKniBridge524(kniSC: NativePtr, kniR: NativePtr, responseSerializer: AFURLResponseSerializationProtocol): Unit {
    return kniBridge594(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("securityPolicy", "@16@0:8", "knimi_com_afnetworking525")
internal fun objcKniBridge526(kniSC: NativePtr, kniR: NativePtr): AFSecurityPolicy {
    return interpretObjCPointerOrNull<AFSecurityPolicy>(kniBridge596(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setSecurityPolicy:", "v24@0:8@16", "knimi_com_afnetworking527")
internal fun objcKniBridge528(kniSC: NativePtr, kniR: NativePtr, securityPolicy: AFSecurityPolicy): Unit {
    return kniBridge598(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, securityPolicy.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("reachabilityManager", "@16@0:8", "knimi_com_afnetworking529")
internal fun objcKniBridge530(kniSC: NativePtr, kniR: NativePtr): AFNetworkReachabilityManager {
    return interpretObjCPointerOrNull<AFNetworkReachabilityManager>(kniBridge600(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setReachabilityManager:", "v24@0:8@16", "knimi_com_afnetworking531")
internal fun objcKniBridge532(kniSC: NativePtr, kniR: NativePtr, reachabilityManager: AFNetworkReachabilityManager): Unit {
    return kniBridge602(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, reachabilityManager.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("tasks", "@16@0:8", "knimi_com_afnetworking533")
internal fun objcKniBridge534(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge604(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("dataTasks", "@16@0:8", "knimi_com_afnetworking535")
internal fun objcKniBridge536(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge606(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("uploadTasks", "@16@0:8", "knimi_com_afnetworking537")
internal fun objcKniBridge538(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge608(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("downloadTasks", "@16@0:8", "knimi_com_afnetworking539")
internal fun objcKniBridge540(kniSC: NativePtr, kniR: NativePtr): List<*> {
    return interpretObjCPointerOrNull<List<*>>(kniBridge610(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("completionQueue", "@16@0:8", "knimi_com_afnetworking541")
internal fun objcKniBridge542(kniSC: NativePtr, kniR: NativePtr): dispatch_queue_t? {
    return interpretObjCPointerOrNull<NSObject>(kniBridge612(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCompletionQueue:", "v24@0:8@16", "knimi_com_afnetworking543")
internal fun objcKniBridge544(kniSC: NativePtr, kniR: NativePtr, completionQueue: dispatch_queue_t?): Unit {
    return kniBridge614(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, completionQueue.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("completionGroup", "@16@0:8", "knimi_com_afnetworking545")
internal fun objcKniBridge546(kniSC: NativePtr, kniR: NativePtr): dispatch_group_t? {
    return interpretObjCPointerOrNull<NSObject>(kniBridge616(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setCompletionGroup:", "v24@0:8@16", "knimi_com_afnetworking547")
internal fun objcKniBridge548(kniSC: NativePtr, kniR: NativePtr, completionGroup: dispatch_group_t?): Unit {
    return kniBridge618(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, completionGroup.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("attemptsToRecreateUploadTasksForBackgroundSessions", "B16@0:8", "knimi_com_afnetworking549")
internal fun objcKniBridge550(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge620(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setAttemptsToRecreateUploadTasksForBackgroundSessions:", "v20@0:8B16", "knimi_com_afnetworking551")
internal fun objcKniBridge552(kniSC: NativePtr, kniR: NativePtr, attemptsToRecreateUploadTasksForBackgroundSessions: Boolean): Unit {
    return kniBridge622(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, attemptsToRecreateUploadTasksForBackgroundSessions.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking553")
internal fun objcKniBridge554(kniSC: NativePtr, kniR: NativePtr): AFURLSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge624(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking555")
internal fun objcKniBridge556(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFURLSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFURLSessionManager>(kniBridge626(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_afnetworking557")
internal fun objcKniBridge558(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge628(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_afnetworking559")
internal fun objcKniBridge560(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge630(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_afnetworking561")
internal fun objcKniBridge562(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge632(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_afnetworking563")
internal fun objcKniBridge564(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge634(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_afnetworking565")
internal fun objcKniBridge566(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge636(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_afnetworking567")
internal fun objcKniBridge568(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge638(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_afnetworking569")
internal fun objcKniBridge570(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge640(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_afnetworking571")
internal fun objcKniBridge572(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge642(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_afnetworking573")
internal fun objcKniBridge574(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge644(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_afnetworking575")
internal fun objcKniBridge576(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge646(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_afnetworking577")
internal fun objcKniBridge578(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge648(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_afnetworking579")
internal fun objcKniBridge580(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge650(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_afnetworking581")
internal fun objcKniBridge582(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge652(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:downloadTask:didFinishDownloadingToURL:", "v40@0:8@16@24@32", "knimi_com_afnetworking583")
internal fun objcKniBridge584(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, downloadTask: NSURLSessionDownloadTask, didFinishDownloadingToURL: NSURL): Unit {
    return kniBridge654(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), downloadTask.objcPtr(), didFinishDownloadingToURL.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking585")
internal fun objcKniBridge586(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge656(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking587")
internal fun objcKniBridge588(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge658(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_afnetworking589")
internal fun objcKniBridge590(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge660(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:didBecomeInvalidWithError:", "v32@0:8@16@24", "knimi_com_afnetworking591")
internal fun objcKniBridge592(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, didBecomeInvalidWithError: NSError?): Unit {
    return kniBridge662(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), didBecomeInvalidWithError.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:didReceiveChallenge:completionHandler:", "v40@0:8@16@24@\u003F32", "knimi_com_afnetworking593")
internal fun objcKniBridge594(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit {
    return kniBridge664(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), didReceiveChallenge.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSessionDidFinishEventsForBackgroundURLSession:", "v24@0:8@16", "knimi_com_afnetworking595")
internal fun objcKniBridge596(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession): Unit {
    return kniBridge668(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:willBeginDelayedRequest:completionHandler:", "v48@0:8@16@24@32@\u003F40", "knimi_com_afnetworking597")
internal fun objcKniBridge598(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, willBeginDelayedRequest: NSURLRequest, completionHandler: (NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit): Unit {
    return kniBridge670(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), willBeginDelayedRequest.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:taskIsWaitingForConnectivity:", "v32@0:8@16@24", "knimi_com_afnetworking599")
internal fun objcKniBridge600(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, taskIsWaitingForConnectivity: NSURLSessionTask): Unit {
    return kniBridge674(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), taskIsWaitingForConnectivity.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:", "v56@0:8@16@24@32@40@\u003F48", "knimi_com_afnetworking601")
internal fun objcKniBridge602(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, willPerformHTTPRedirection: NSHTTPURLResponse, newRequest: NSURLRequest, completionHandler: (NSURLRequest?) -> Unit): Unit {
    return kniBridge676(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), willPerformHTTPRedirection.objcPtr(), newRequest.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didReceiveChallenge:completionHandler:", "v48@0:8@16@24@32@\u003F40", "knimi_com_afnetworking603")
internal fun objcKniBridge604(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didReceiveChallenge: NSURLAuthenticationChallenge, completionHandler: (NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit): Unit {
    return kniBridge680(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didReceiveChallenge.objcPtr(), createKotlinObjectHolder(completionHandler))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:needNewBodyStream:", "v40@0:8@16@24@\u003F32", "knimi_com_afnetworking605")
internal fun objcKniBridge606(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, needNewBodyStream: (NSInputStream?) -> Unit): Unit {
    return kniBridge684(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), createKotlinObjectHolder(needNewBodyStream))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:", "v56@0:8@16@24q32q40q48", "knimi_com_afnetworking607")
internal fun objcKniBridge608(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didSendBodyData: int64_t, totalBytesSent: int64_t, totalBytesExpectedToSend: int64_t): Unit {
    return kniBridge688(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didSendBodyData, totalBytesSent, totalBytesExpectedToSend)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didFinishCollectingMetrics:", "v40@0:8@16@24@32", "knimi_com_afnetworking609")
internal fun objcKniBridge610(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didFinishCollectingMetrics: NSURLSessionTaskMetrics): Unit {
    return kniBridge690(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didFinishCollectingMetrics.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSession:task:didCompleteWithError:", "v40@0:8@16@24@32", "knimi_com_afnetworking611")
internal fun objcKniBridge612(kniSC: NativePtr, kniR: NativePtr, session: NSURLSession, task: NSURLSessionTask, didCompleteWithError: NSError?): Unit {
    return kniBridge692(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, session.objcPtr(), task.objcPtr(), didCompleteWithError.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("manager", "@16@0:8", "knimi_com_afnetworking613")
internal fun objcKniBridge614(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge694(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_afnetworking615")
internal fun objcKniBridge616(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge696(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking617")
internal fun objcKniBridge618(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge698(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_afnetworking619")
internal fun objcKniBridge620(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge700(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("supportsSecureCoding", "B16@0:8", "knimi_com_afnetworking621")
internal fun objcKniBridge622(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge702(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithBaseURL:", "@24@0:8@16", "knimi_com_afnetworking623")
internal fun objcKniBridge624(kniSC: NativePtr, kniR: NativePtr, url: NSURL?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge704(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, url.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithBaseURL:sessionConfiguration:", "@32@0:8@16@24", "knimi_com_afnetworking625")
internal fun objcKniBridge626(kniSC: NativePtr, kniR: NativePtr, url: NSURL?, sessionConfiguration: NSURLSessionConfiguration?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge706(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, url.objcPtr(), sessionConfiguration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("GET:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking627")
internal fun objcKniBridge628(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge708(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("GET:parameters:progress:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking629")
internal fun objcKniBridge630(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge714(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("HEAD:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking631")
internal fun objcKniBridge632(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge722(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking633")
internal fun objcKniBridge634(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge728(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:progress:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking635")
internal fun objcKniBridge636(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge734(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:constructingBodyWithBlock:success:failure:", "@56@0:8@16@24@\u003F32@\u003F40@\u003F48", "knimi_com_afnetworking637")
internal fun objcKniBridge638(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge742(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("POST:parameters:constructingBodyWithBlock:progress:success:failure:", "@64@0:8@16@24@\u003F32@\u003F40@\u003F48@\u003F56", "knimi_com_afnetworking639")
internal fun objcKniBridge640(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, constructingBodyWithBlock: ((AFMultipartFormDataProtocol?) -> Unit)?, progress: ((NSProgress?) -> Unit)?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge750(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(constructingBodyWithBlock), createKotlinObjectHolder(progress), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("PUT:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking641")
internal fun objcKniBridge642(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge760(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("PATCH:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking643")
internal fun objcKniBridge644(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge766(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("DELETE:parameters:success:failure:", "@48@0:8@16@24@\u003F32@\u003F40", "knimi_com_afnetworking645")
internal fun objcKniBridge646(kniSC: NativePtr, kniR: NativePtr, URLString: String, parameters: Any?, success: ((NSURLSessionDataTask?, Any?) -> Unit)?, failure: ((NSURLSessionDataTask?, NSError?) -> Unit)?): NSURLSessionDataTask? {
    return interpretObjCPointerOrNull<NSURLSessionDataTask>(kniBridge772(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLString.objcPtr(), parameters.objcPtr(), createKotlinObjectHolder(success), createKotlinObjectHolder(failure)))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("baseURL", "@16@0:8", "knimi_com_afnetworking647")
internal fun objcKniBridge648(kniSC: NativePtr, kniR: NativePtr): NSURL? {
    return interpretObjCPointerOrNull<NSURL>(kniBridge778(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("requestSerializer", "@16@0:8", "knimi_com_afnetworking649")
internal fun objcKniBridge650(kniSC: NativePtr, kniR: NativePtr): AFHTTPRequestSerializer {
    return interpretObjCPointerOrNull<AFHTTPRequestSerializer>(kniBridge780(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setRequestSerializer:", "v24@0:8@16", "knimi_com_afnetworking651")
internal fun objcKniBridge652(kniSC: NativePtr, kniR: NativePtr, requestSerializer: AFHTTPRequestSerializer): Unit {
    return kniBridge782(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, requestSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("responseSerializer", "@16@0:8", "knimi_com_afnetworking653")
internal fun objcKniBridge654(kniSC: NativePtr, kniR: NativePtr): AFHTTPResponseSerializer {
    return interpretObjCPointerOrNull<AFHTTPResponseSerializer>(kniBridge784(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setResponseSerializer:", "v24@0:8@16", "knimi_com_afnetworking655")
internal fun objcKniBridge656(kniSC: NativePtr, kniR: NativePtr, responseSerializer: AFHTTPResponseSerializer): Unit {
    return kniBridge786(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, responseSerializer.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithSessionConfiguration:", "@24@0:8@16", "knimi_com_afnetworking657")
internal fun objcKniBridge658(kniSC: NativePtr, kniR: NativePtr, configuration: NSURLSessionConfiguration?): AFHTTPSessionManager {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge788(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, configuration.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_afnetworking659")
internal fun objcKniBridge660(kniSC: NativePtr, kniR: NativePtr): AFHTTPSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge790(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_afnetworking661")
internal fun objcKniBridge662(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): AFHTTPSessionManager? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<AFHTTPSessionManager>(kniBridge792(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("encodeWithCoder:", "v24@0:8@16", "knimi_com_afnetworking663")
internal fun objcKniBridge664(kniSC: NativePtr, kniR: NativePtr, aCoder: NSCoder): Unit {
    return kniBridge794(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aCoder.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("copyWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_afnetworking665")
internal fun objcKniBridge666(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<NSZone>?): Any {
    return interpretObjCPointerOrNull<Any>(kniBridge796(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))!!
}
@SymbolName("com_afnetworking_kniBridge0")
private external fun kniBridge0(p0: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge2")
private fun kniBridge2(p0: Byte, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(Boolean, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0.toBoolean(), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge1")
private external fun kniBridge1(p0: ULong, p1: Byte, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge3")
private external fun kniBridge3(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge5")
private external fun kniBridge5(p0: Long): NativePtr
@SymbolName("com_afnetworking_kniBridge6")
private external fun kniBridge6(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge7")
private fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLResponseSerializationProtocol>().responseObjectForResponse(response = interpretObjCPointerOrNull<NSURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge9")
private fun kniBridge9(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLResponseSerializationProtocol>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge11")
private fun kniBridge11(p0: NativePtr, p1: NativePtr, p2: Long): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!, didChangeState = UIGuidedAccessRestrictionState.byValue(p2))
}
@SymbolName("com_afnetworking_kniBridge12")
private external fun kniBridge12(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge13")
private fun kniBridge13(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge14")
private external fun kniBridge14(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge15")
private fun kniBridge15(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge17")
private fun kniBridge17(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionIdentifiers().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge18")
private external fun kniBridge18(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge19")
private fun kniBridge19(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionDelegateProtocol>().pencilInteractionDidTap(interaction = interpretObjCPointerOrNull<UIPencilInteraction>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge20")
private external fun kniBridge20(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge21")
private fun kniBridge21(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLRequestSerializationProtocol>().requestBySerializingRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, withParameters = interpretObjCPointerOrNull<Any>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge23")
private fun kniBridge23(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLRequestSerializationProtocol>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge25")
private fun kniBridge25(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileURL(fileURL = interpretObjCPointerOrNull<NSURL>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).toByte()
}
@SymbolName("com_afnetworking_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge27")
private fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileURL(fileURL = interpretObjCPointerOrNull<NSURL>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, mimeType = interpretObjCPointerOrNull<String>(p4)!!, error = interpretCPointer<ObjCObjectVar<NSError?>>(p5)).toByte()
}
@SymbolName("com_afnetworking_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: Long, p6: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge29")
private fun kniBridge29(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithInputStream(inputStream = interpretObjCPointerOrNull<NSInputStream>(p1), name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, length = p4, mimeType = interpretObjCPointerOrNull<String>(p5)!!)
}
@SymbolName("com_afnetworking_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge31")
private fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFileData(data = interpretObjCPointerOrNull<NSData>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!, fileName = interpretObjCPointerOrNull<String>(p3)!!, mimeType = interpretObjCPointerOrNull<String>(p4)!!)
}
@SymbolName("com_afnetworking_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge33")
private fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithFormData(data = interpretObjCPointerOrNull<NSData>(p1)!!, name = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge34")
private external fun kniBridge34(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge35")
private fun kniBridge35(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().appendPartWithHeaders(headers = interpretObjCPointerOrNull<Map<Any?, *>>(p1), body = interpretObjCPointerOrNull<NSData>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr, p2: ULong, p3: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge37")
private fun kniBridge37(p0: NativePtr, p1: ULong, p2: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFMultipartFormDataProtocol>().throttleBandwidthWithPacketSize(numberOfBytes = p1, delay = p2)
}
@SymbolName("com_afnetworking_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge39")
private fun kniBridge39(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge41")
private fun kniBridge41(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge43")
private fun kniBridge43(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge45")
private fun kniBridge45(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge47")
private fun kniBridge47(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge49")
private fun kniBridge49(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge51")
private fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().validateResponse(response = interpretObjCPointerOrNull<NSHTTPURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).toByte()
}
@SymbolName("com_afnetworking_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge53")
private fun kniBridge53(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().stringEncoding()
}
@SymbolName("com_afnetworking_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge55")
private fun kniBridge55(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setStringEncoding(stringEncoding = p1)
}
@SymbolName("com_afnetworking_kniBridge56")
private external fun kniBridge56(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge57")
private fun kniBridge57(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().acceptableStatusCodes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge59")
private fun kniBridge59(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setAcceptableStatusCodes(acceptableStatusCodes = interpretObjCPointerOrNull<NSIndexSet>(p1))
}
@SymbolName("com_afnetworking_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge61")
private fun kniBridge61(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().acceptableContentTypes().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge63")
private fun kniBridge63(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().setAcceptableContentTypes(acceptableContentTypes = interpretObjCPointerOrNull<Set<*>>(p1))
}
@SymbolName("com_afnetworking_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge65")
private fun kniBridge65(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge67")
private fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().responseObjectForResponse(response = interpretObjCPointerOrNull<NSURLResponse>(p1), data = interpretObjCPointerOrNull<NSData>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge69")
private fun kniBridge69(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge71")
private fun kniBridge71(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge73")
private fun kniBridge73(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge74")
private external fun kniBridge74(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge75")
private fun kniBridge75(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge77")
private fun kniBridge77(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge79")
private fun kniBridge79(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge81")
private fun kniBridge81(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge83")
private fun kniBridge83(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge85")
private fun kniBridge85(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge86")
private external fun kniBridge86(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge87")
private fun kniBridge87(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge88")
private external fun kniBridge88(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge89")
private fun kniBridge89(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().hash()
}
@SymbolName("com_afnetworking_kniBridge90")
private external fun kniBridge90(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge91")
private fun kniBridge91(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge93")
private fun kniBridge93(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge94")
private external fun kniBridge94(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge95")
private fun kniBridge95(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge96")
private external fun kniBridge96(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge97")
private fun kniBridge97(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge98")
private external fun kniBridge98(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge99")
private fun kniBridge99(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPResponseSerializer>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge100")
private external fun kniBridge100(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge101")
private fun kniBridge101(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().serializerWithReadingOptions(readingOptions = p1).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge102")
private external fun kniBridge102(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge103")
private fun kniBridge103(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge104")
private external fun kniBridge104(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge105")
private fun kniBridge105(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge106")
private external fun kniBridge106(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge107")
private fun kniBridge107(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge108")
private external fun kniBridge108(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge109")
private fun kniBridge109(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge111")
private fun kniBridge111(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().readingOptions()
}
@SymbolName("com_afnetworking_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge113")
private fun kniBridge113(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().setReadingOptions(readingOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge115")
private fun kniBridge115(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().removesKeysWithNullValues().toByte()
}
@SymbolName("com_afnetworking_kniBridge116")
private external fun kniBridge116(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge117")
private fun kniBridge117(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().setRemovesKeysWithNullValues(removesKeysWithNullValues = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge118")
private external fun kniBridge118(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge119")
private fun kniBridge119(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge120")
private external fun kniBridge120(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge121")
private fun kniBridge121(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge123")
private fun kniBridge123(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge125")
private fun kniBridge125(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge127")
private fun kniBridge127(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge129")
private fun kniBridge129(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge130")
private external fun kniBridge130(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge131")
private fun kniBridge131(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge133")
private fun kniBridge133(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFXMLParserResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge134")
private external fun kniBridge134(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge135")
private fun kniBridge135(p0: NativePtr, p1: ULong, p2: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().serializerWithFormat(format = p1, readOptions = p2).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge136")
private external fun kniBridge136(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge137")
private fun kniBridge137(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge138")
private external fun kniBridge138(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge139")
private fun kniBridge139(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge140")
private external fun kniBridge140(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge141")
private fun kniBridge141(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge142")
private external fun kniBridge142(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge143")
private fun kniBridge143(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge144")
private external fun kniBridge144(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge145")
private fun kniBridge145(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().format()
}
@SymbolName("com_afnetworking_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge147")
private fun kniBridge147(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().setFormat(format = p1)
}
@SymbolName("com_afnetworking_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge149")
private fun kniBridge149(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().readOptions()
}
@SymbolName("com_afnetworking_kniBridge150")
private external fun kniBridge150(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge151")
private fun kniBridge151(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().setReadOptions(readOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge152")
private external fun kniBridge152(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge153")
private fun kniBridge153(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge154")
private external fun kniBridge154(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge155")
private fun kniBridge155(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge157")
private fun kniBridge157(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge158")
private external fun kniBridge158(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge159")
private fun kniBridge159(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge160")
private external fun kniBridge160(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge161")
private fun kniBridge161(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge163")
private fun kniBridge163(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge165")
private fun kniBridge165(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().imageScale()
}
@SymbolName("com_afnetworking_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge167")
private fun kniBridge167(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().setImageScale(imageScale = p1)
}
@SymbolName("com_afnetworking_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge169")
private fun kniBridge169(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().automaticallyInflatesResponseImage().toByte()
}
@SymbolName("com_afnetworking_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge171")
private fun kniBridge171(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().setAutomaticallyInflatesResponseImage(automaticallyInflatesResponseImage = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge173")
private fun kniBridge173(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge175")
private fun kniBridge175(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFImageResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge177")
private fun kniBridge177(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().compoundSerializerWithResponseSerializers(responseSerializers = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge179")
private fun kniBridge179(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge180")
private external fun kniBridge180(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge181")
private fun kniBridge181(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge182")
private external fun kniBridge182(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge183")
private fun kniBridge183(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge184")
private external fun kniBridge184(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge185")
private fun kniBridge185(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge187")
private fun kniBridge187(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().responseSerializers().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge188")
private external fun kniBridge188(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge189")
private fun kniBridge189(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge190")
private external fun kniBridge190(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge191")
private fun kniBridge191(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFCompoundResponseSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge192")
private external fun kniBridge192(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge193")
private fun kniBridge193(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().preferredTapAction()
}
@SymbolName("com_afnetworking_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge195")
private fun kniBridge195(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge197")
private fun kniBridge197(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge199")
private fun kniBridge199(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge201")
private fun kniBridge201(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().delegate().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge202")
private external fun kniBridge202(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge203")
private fun kniBridge203(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setDelegate(delegate = interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(p1))
}
@SymbolName("com_afnetworking_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge205")
private fun kniBridge205(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEnabled().toByte()
}
@SymbolName("com_afnetworking_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge207")
private fun kniBridge207(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setEnabled(enabled = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge209")
private fun kniBridge209(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge211")
private fun kniBridge211(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().willMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_afnetworking_kniBridge212")
private external fun kniBridge212(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge213")
private fun kniBridge213(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().didMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_afnetworking_kniBridge214")
private external fun kniBridge214(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge215")
private fun kniBridge215(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().view().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge217")
private fun kniBridge217(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge218")
private external fun kniBridge218(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge219")
private fun kniBridge219(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge220")
private external fun kniBridge220(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge221")
private fun kniBridge221(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge223")
private fun kniBridge223(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge225")
private fun kniBridge225(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge227")
private fun kniBridge227(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge229")
private fun kniBridge229(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge231")
private fun kniBridge231(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge233")
private fun kniBridge233(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge234")
private external fun kniBridge234(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge235")
private fun kniBridge235(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge237")
private fun kniBridge237(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().hash()
}
@SymbolName("com_afnetworking_kniBridge238")
private external fun kniBridge238(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge239")
private fun kniBridge239(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge240")
private external fun kniBridge240(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge241")
private fun kniBridge241(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge243")
private fun kniBridge243(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge245")
private fun kniBridge245(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge246")
private external fun kniBridge246(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge247")
private fun kniBridge247(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge249")
private fun kniBridge249(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge251")
private fun kniBridge251(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge253")
private fun kniBridge253(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge255")
private fun kniBridge255(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setValue(value = interpretObjCPointerOrNull<String>(p1), forHTTPHeaderField = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge257")
private fun kniBridge257(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().valueForHTTPHeaderField(field = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge259")
private fun kniBridge259(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setAuthorizationHeaderFieldWithUsername(username = interpretObjCPointerOrNull<String>(p1)!!, password = interpretObjCPointerOrNull<String>(p2)!!)
}
@SymbolName("com_afnetworking_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge261")
private fun kniBridge261(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().clearAuthorizationHeader()
}
@SymbolName("com_afnetworking_kniBridge262")
private external fun kniBridge262(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge263")
private fun kniBridge263(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setQueryStringSerializationWithStyle(style = p1)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge265")
private fun kniBridge265(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLRequest?, Any?, CPointer<ObjCObjectVar<NSError?>>?) -> String?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLRequest>(p0), interpretObjCPointerOrNull<Any>(p1), interpretCPointer<ObjCObjectVar<NSError?>>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge267")
private external fun kniBridge267(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge266")
private fun kniBridge266(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setQueryStringSerializationWithBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLRequest?, p1: Any?, p2: CPointer<ObjCObjectVar<NSError?>>?): String? {
return interpretObjCPointerOrNull<String>(kniBridge267(p0.objcPtr(), p1.objcPtr(), p2.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@SymbolName("com_afnetworking_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge269")
private fun kniBridge269(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestWithMethod(method = interpretObjCPointerOrNull<String>(p1)!!, URLString = interpretObjCPointerOrNull<String>(p2)!!, parameters = interpretObjCPointerOrNull<Any>(p3), error = interpretCPointer<ObjCObjectVar<NSError?>>(p4)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge271")
private fun kniBridge271(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@SymbolName("com_afnetworking_kniBridge270")
private external fun kniBridge270(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge273")
private external fun kniBridge273(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge272")
private fun kniBridge272(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().multipartFormRequestWithMethod(method = interpretObjCPointerOrNull<String>(p1)!!, URLString = interpretObjCPointerOrNull<String>(p2)!!, parameters = interpretObjCPointerOrNull<Map<Any?, *>>(p3), constructingBodyWithBlock = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge273(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, error = interpretCPointer<ObjCObjectVar<NSError?>>(p5)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge275")
private fun kniBridge275(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSError>(p0))
}
@SymbolName("com_afnetworking_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge277")
private external fun kniBridge277(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge276")
private fun kniBridge276(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestWithMultipartFormRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, writingStreamContentsToFile = interpretObjCPointerOrNull<NSURL>(p2)!!, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSError?): Unit {
return kniBridge277(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge279")
private fun kniBridge279(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().stringEncoding()
}
@SymbolName("com_afnetworking_kniBridge280")
private external fun kniBridge280(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge281")
private fun kniBridge281(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setStringEncoding(stringEncoding = p1)
}
@SymbolName("com_afnetworking_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge283")
private fun kniBridge283(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().allowsCellularAccess().toByte()
}
@SymbolName("com_afnetworking_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge285")
private fun kniBridge285(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setAllowsCellularAccess(allowsCellularAccess = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge287")
private fun kniBridge287(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().cachePolicy()
}
@SymbolName("com_afnetworking_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge289")
private fun kniBridge289(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setCachePolicy(cachePolicy = p1)
}
@SymbolName("com_afnetworking_kniBridge290")
private external fun kniBridge290(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge291")
private fun kniBridge291(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPShouldHandleCookies().toByte()
}
@SymbolName("com_afnetworking_kniBridge292")
private external fun kniBridge292(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge293")
private fun kniBridge293(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPShouldHandleCookies(HTTPShouldHandleCookies = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge294")
private external fun kniBridge294(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge295")
private fun kniBridge295(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPShouldUsePipelining().toByte()
}
@SymbolName("com_afnetworking_kniBridge296")
private external fun kniBridge296(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge297")
private fun kniBridge297(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPShouldUsePipelining(HTTPShouldUsePipelining = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge298")
private external fun kniBridge298(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge299")
private fun kniBridge299(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().networkServiceType()
}
@SymbolName("com_afnetworking_kniBridge300")
private external fun kniBridge300(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge301")
private fun kniBridge301(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setNetworkServiceType(networkServiceType = p1)
}
@SymbolName("com_afnetworking_kniBridge302")
private external fun kniBridge302(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge303")
private fun kniBridge303(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().timeoutInterval()
}
@SymbolName("com_afnetworking_kniBridge304")
private external fun kniBridge304(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge305")
private fun kniBridge305(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setTimeoutInterval(timeoutInterval = p1)
}
@SymbolName("com_afnetworking_kniBridge306")
private external fun kniBridge306(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge307")
private fun kniBridge307(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPRequestHeaders().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge308")
private external fun kniBridge308(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge309")
private fun kniBridge309(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().HTTPMethodsEncodingParametersInURI().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge310")
private external fun kniBridge310(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge311")
private fun kniBridge311(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().setHTTPMethodsEncodingParametersInURI(HTTPMethodsEncodingParametersInURI = interpretObjCPointerOrNull<Set<*>>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge312")
private external fun kniBridge312(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge313")
private fun kniBridge313(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge314")
private external fun kniBridge314(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge315")
private fun kniBridge315(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge316")
private external fun kniBridge316(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge317")
private fun kniBridge317(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().requestBySerializingRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, withParameters = interpretObjCPointerOrNull<Any>(p2), error = interpretCPointer<ObjCObjectVar<NSError?>>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge318")
private external fun kniBridge318(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge319")
private fun kniBridge319(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge320")
private external fun kniBridge320(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge321")
private fun kniBridge321(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge322")
private external fun kniBridge322(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge323")
private fun kniBridge323(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge325")
private fun kniBridge325(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge326")
private external fun kniBridge326(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge327")
private fun kniBridge327(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge328")
private external fun kniBridge328(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge329")
private fun kniBridge329(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge331")
private fun kniBridge331(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge332")
private external fun kniBridge332(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge333")
private fun kniBridge333(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge335")
private fun kniBridge335(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge337")
private fun kniBridge337(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge338")
private external fun kniBridge338(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge339")
private fun kniBridge339(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().hash()
}
@SymbolName("com_afnetworking_kniBridge340")
private external fun kniBridge340(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge341")
private fun kniBridge341(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge342")
private external fun kniBridge342(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge343")
private fun kniBridge343(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge344")
private external fun kniBridge344(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge345")
private fun kniBridge345(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge346")
private external fun kniBridge346(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge347")
private fun kniBridge347(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge348")
private external fun kniBridge348(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge349")
private fun kniBridge349(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPRequestSerializer>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge351")
private fun kniBridge351(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().serializerWithWritingOptions(writingOptions = p1).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge352")
private external fun kniBridge352(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge353")
private fun kniBridge353(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge355")
private fun kniBridge355(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge357")
private fun kniBridge357(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge358")
private external fun kniBridge358(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge359")
private fun kniBridge359(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge360")
private external fun kniBridge360(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge361")
private fun kniBridge361(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().writingOptions()
}
@SymbolName("com_afnetworking_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge363")
private fun kniBridge363(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().setWritingOptions(writingOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge365")
private fun kniBridge365(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge366")
private external fun kniBridge366(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge367")
private fun kniBridge367(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFJSONRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: NativePtr, p2: ULong, p3: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge369")
private fun kniBridge369(p0: NativePtr, p1: ULong, p2: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().serializerWithFormat(format = p1, writeOptions = p2).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge370")
private external fun kniBridge370(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge371")
private fun kniBridge371(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().serializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge372")
private external fun kniBridge372(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge373")
private fun kniBridge373(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge375")
private fun kniBridge375(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge377")
private fun kniBridge377(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge379")
private fun kniBridge379(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().format()
}
@SymbolName("com_afnetworking_kniBridge380")
private external fun kniBridge380(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge381")
private fun kniBridge381(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().setFormat(format = p1)
}
@SymbolName("com_afnetworking_kniBridge382")
private external fun kniBridge382(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge383")
private fun kniBridge383(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().writeOptions()
}
@SymbolName("com_afnetworking_kniBridge384")
private external fun kniBridge384(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge385")
private fun kniBridge385(p0: NativePtr, p1: ULong): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().setWriteOptions(writeOptions = p1)
}
@SymbolName("com_afnetworking_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge387")
private fun kniBridge387(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge388")
private external fun kniBridge388(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge389")
private fun kniBridge389(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFPropertyListRequestSerializer>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge390")
private external fun kniBridge390(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge391")
private fun kniBridge391(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().certificatesInBundle(bundle = interpretObjCPointerOrNull<NSBundle>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge392")
private external fun kniBridge392(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge393")
private fun kniBridge393(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().defaultPolicy().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge394")
private external fun kniBridge394(p0: NativePtr, p1: NativePtr, p2: ULong): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge395")
private fun kniBridge395(p0: NativePtr, p1: ULong): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().policyWithPinningMode(pinningMode = AFSSLPinningMode.byValue(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge396")
private external fun kniBridge396(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge397")
private fun kniBridge397(p0: NativePtr, p1: ULong, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().policyWithPinningMode(pinningMode = AFSSLPinningMode.byValue(p1), withPinnedCertificates = interpretObjCPointerOrNull<Set<*>>(p2)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge398")
private external fun kniBridge398(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge399")
private fun kniBridge399(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge401")
private fun kniBridge401(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge403")
private fun kniBridge403(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge404")
private external fun kniBridge404(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge405")
private fun kniBridge405(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicyMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge407")
private fun kniBridge407(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().evaluateServerTrust(serverTrust = interpretCPointer<__SecTrust>(p1), forDomain = interpretObjCPointerOrNull<String>(p2)).toByte()
}
@SymbolName("com_afnetworking_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge409")
private fun kniBridge409(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().SSLPinningMode().value
}
@SymbolName("com_afnetworking_kniBridge410")
private external fun kniBridge410(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge411")
private fun kniBridge411(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().pinnedCertificates().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge412")
private external fun kniBridge412(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge413")
private fun kniBridge413(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setPinnedCertificates(pinnedCertificates = interpretObjCPointerOrNull<Set<*>>(p1))
}
@SymbolName("com_afnetworking_kniBridge414")
private external fun kniBridge414(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge415")
private fun kniBridge415(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().allowInvalidCertificates().toByte()
}
@SymbolName("com_afnetworking_kniBridge416")
private external fun kniBridge416(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge417")
private fun kniBridge417(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setAllowInvalidCertificates(allowInvalidCertificates = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge418")
private external fun kniBridge418(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge419")
private fun kniBridge419(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().validatesDomainName().toByte()
}
@SymbolName("com_afnetworking_kniBridge420")
private external fun kniBridge420(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge421")
private fun kniBridge421(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().setValidatesDomainName(validatesDomainName = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge422")
private external fun kniBridge422(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge423")
private fun kniBridge423(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge424")
private external fun kniBridge424(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge425")
private fun kniBridge425(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge426")
private external fun kniBridge426(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge427")
private fun kniBridge427(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge429")
private fun kniBridge429(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFSecurityPolicy>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge431")
private fun kniBridge431(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().sharedManager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge433")
private fun kniBridge433(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().manager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge435")
private fun kniBridge435(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().managerForDomain(domain = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge437")
private fun kniBridge437(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().managerForAddress(address = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge438")
private external fun kniBridge438(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge439")
private fun kniBridge439(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge441")
private fun kniBridge441(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge442")
private external fun kniBridge442(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge443")
private fun kniBridge443(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge444")
private external fun kniBridge444(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge445")
private fun kniBridge445(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().initWithReachability(reachability = interpretCPointer<__SCNetworkReachability>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge446")
private external fun kniBridge446(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge447")
private fun kniBridge447(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().startMonitoring()
}
@SymbolName("com_afnetworking_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge449")
private fun kniBridge449(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().stopMonitoring()
}
@SymbolName("com_afnetworking_kniBridge450")
private external fun kniBridge450(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge451")
private fun kniBridge451(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().localizedNetworkReachabilityStatusString().objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge453")
private fun kniBridge453(p0: Long, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFNetworkReachabilityStatus) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(p0)
}
@SymbolName("com_afnetworking_kniBridge452")
private external fun kniBridge452(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge455")
private external fun kniBridge455(p0: Long, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge454")
private fun kniBridge454(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().setReachabilityStatusChangeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFNetworkReachabilityStatus): Unit {
return kniBridge455(p0, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge456")
private external fun kniBridge456(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge457")
private fun kniBridge457(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().networkReachabilityStatus()
}
@SymbolName("com_afnetworking_kniBridge458")
private external fun kniBridge458(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge459")
private fun kniBridge459(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachable().toByte()
}
@SymbolName("com_afnetworking_kniBridge460")
private external fun kniBridge460(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge461")
private fun kniBridge461(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachableViaWWAN().toByte()
}
@SymbolName("com_afnetworking_kniBridge462")
private external fun kniBridge462(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge463")
private fun kniBridge463(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().isReachableViaWiFi().toByte()
}
@SymbolName("com_afnetworking_kniBridge464")
private external fun kniBridge464(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge465")
private fun kniBridge465(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFNetworkReachabilityManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge466")
private external fun kniBridge466(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge467")
private fun kniBridge467(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge469")
private fun kniBridge469(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge470")
private external fun kniBridge470(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge471")
private fun kniBridge471(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge472")
private external fun kniBridge472(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge473")
private fun kniBridge473(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManagerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge474")
private external fun kniBridge474(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge475")
private fun kniBridge475(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().initWithSessionConfiguration(configuration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge477")
private fun kniBridge477(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().invalidateSessionCancelingTasks(cancelPendingTasks = p1.toBoolean())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge479")
private fun kniBridge479(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge478")
private external fun kniBridge478(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge481")
private external fun kniBridge481(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge480")
private fun kniBridge480(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, completionHandler = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge481(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge483")
private fun kniBridge483(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge484")
private fun kniBridge484(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge485")
private fun kniBridge485(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge487")
private external fun kniBridge487(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge488")
private external fun kniBridge488(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge489")
private external fun kniBridge489(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge486")
private fun kniBridge486(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, uploadProgress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge487(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, downloadProgress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge488(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge489(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge491")
private fun kniBridge491(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge492")
private fun kniBridge492(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge490")
private external fun kniBridge490(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge494")
private external fun kniBridge494(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge495")
private external fun kniBridge495(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge493")
private fun kniBridge493(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, fromFile = interpretObjCPointerOrNull<NSURL>(p2)!!, progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge494(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge495(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge497")
private fun kniBridge497(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge498")
private fun kniBridge498(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge496")
private external fun kniBridge496(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge501")
private external fun kniBridge501(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge499")
private fun kniBridge499(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, fromData = interpretObjCPointerOrNull<NSData>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge500(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge501(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge503")
private fun kniBridge503(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge504")
private fun kniBridge504(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, Any?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<Any>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge507")
private external fun kniBridge507(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge505")
private fun kniBridge505(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTaskWithStreamedRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge506(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: Any?, p2: NSError?): Unit {
return kniBridge507(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge509")
private fun kniBridge509(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge510")
private fun kniBridge510(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURL?, NSURLResponse?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSURLResponse>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge511")
private fun kniBridge511(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<NSURL>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge508")
private external fun kniBridge508(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge513")
private external fun kniBridge513(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge514")
private external fun kniBridge514(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge515")
private external fun kniBridge515(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge512")
private fun kniBridge512(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTaskWithRequest(request = interpretObjCPointerOrNull<NSURLRequest>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge513(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, destination = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURL?, p1: NSURLResponse?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge514(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: NSURL?, p2: NSError?): Unit {
return kniBridge515(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge517")
private fun kniBridge517(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge518")
private fun kniBridge518(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURL?, NSURLResponse?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURL>(p0), interpretObjCPointerOrNull<NSURLResponse>(p1)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge519")
private fun kniBridge519(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLResponse?, NSURL?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLResponse>(p0), interpretObjCPointerOrNull<NSURL>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge521")
private external fun kniBridge521(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge523")
private external fun kniBridge523(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge520")
private fun kniBridge520(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTaskWithResumeData(resumeData = interpretObjCPointerOrNull<NSData>(p1)!!, progress = p2.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge521(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, destination = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURL?, p1: NSURLResponse?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge522(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} }, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLResponse?, p1: NSURL?, p2: NSError?): Unit {
return kniBridge523(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge524")
private external fun kniBridge524(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge525")
private fun kniBridge525(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadProgressForTask(task = interpretObjCPointerOrNull<NSURLSessionTask>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge527")
private fun kniBridge527(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadProgressForTask(task = interpretObjCPointerOrNull<NSURLSessionTask>(p1)!!).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge529")
private fun kniBridge529(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge528")
private external fun kniBridge528(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge531")
private external fun kniBridge531(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge530")
private fun kniBridge530(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSessionDidBecomeInvalidBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSError?): Unit {
return kniBridge531(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge533")
private fun kniBridge533(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p1), interpretCPointer<ObjCObjectVar<NSURLCredential?>>(p2))
}
@SymbolName("com_afnetworking_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge535")
private external fun kniBridge535(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge534")
private fun kniBridge534(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSessionDidReceiveAuthenticationChallengeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLAuthenticationChallenge?, p2: CPointer<ObjCObjectVar<NSURLCredential?>>?): NSURLSessionAuthChallengeDisposition {
return kniBridge535(p0.objcPtr(), p1.objcPtr(), p2.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge537")
private fun kniBridge537(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?) -> NSInputStream?>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge536")
private external fun kniBridge536(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge539")
private external fun kniBridge539(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge538")
private fun kniBridge538(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskNeedNewBodyStreamBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?): NSInputStream? {
return interpretObjCPointerOrNull<NSInputStream>(kniBridge539(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge541")
private fun kniBridge541(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSURLResponse?, NSURLRequest?) -> NSURLRequest?>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSURLResponse>(p2), interpretObjCPointerOrNull<NSURLRequest>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge540")
private external fun kniBridge540(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge543")
private external fun kniBridge543(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge542")
private fun kniBridge542(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskWillPerformHTTPRedirectionBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSURLResponse?, p3: NSURLRequest?): NSURLRequest? {
return interpretObjCPointerOrNull<NSURLRequest>(kniBridge543(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), p3.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge545")
private fun kniBridge545(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSURLAuthenticationChallenge?, CPointer<ObjCObjectVar<NSURLCredential?>>?) -> NSURLSessionAuthChallengeDisposition>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p2), interpretCPointer<ObjCObjectVar<NSURLCredential?>>(p3))
}
@SymbolName("com_afnetworking_kniBridge544")
private external fun kniBridge544(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge547")
private external fun kniBridge547(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge546")
private fun kniBridge546(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidReceiveAuthenticationChallengeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSURLAuthenticationChallenge?, p3: CPointer<ObjCObjectVar<NSURLCredential?>>?): NSURLSessionAuthChallengeDisposition {
return kniBridge547(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), p3.rawValue, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge549")
private fun kniBridge549(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, int64_t, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p5))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), p2, p3, p4)
}
@SymbolName("com_afnetworking_kniBridge548")
private external fun kniBridge548(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge551")
private external fun kniBridge551(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge550")
private fun kniBridge550(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidSendBodyDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: int64_t, p3: int64_t, p4: int64_t): Unit {
return kniBridge551(p0.objcPtr(), p1.objcPtr(), p2, p3, p4, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge553")
private fun kniBridge553(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionTask>(p1), interpretObjCPointerOrNull<NSError>(p2))
}
@SymbolName("com_afnetworking_kniBridge552")
private external fun kniBridge552(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge555")
private external fun kniBridge555(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge554")
private fun kniBridge554(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setTaskDidCompleteBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionTask?, p2: NSError?): Unit {
return kniBridge555(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge557")
private fun kniBridge557(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSURLResponse?) -> NSURLSessionResponseDisposition>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSURLResponse>(p2))
}
@SymbolName("com_afnetworking_kniBridge556")
private external fun kniBridge556(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge559")
private external fun kniBridge559(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge558")
private fun kniBridge558(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidReceiveResponseBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSURLResponse?): NSURLSessionResponseDisposition {
return kniBridge559(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge561")
private fun kniBridge561(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSURLSessionDownloadTask?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p2))
}
@SymbolName("com_afnetworking_kniBridge560")
private external fun kniBridge560(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge563")
private external fun kniBridge563(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge562")
private fun kniBridge562(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidBecomeDownloadTaskBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSURLSessionDownloadTask?): Unit {
return kniBridge563(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge565")
private fun kniBridge565(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSData?) -> Unit>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSData>(p2))
}
@SymbolName("com_afnetworking_kniBridge564")
private external fun kniBridge564(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge567")
private external fun kniBridge567(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge566")
private fun kniBridge566(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskDidReceiveDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSData?): Unit {
return kniBridge567(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge569")
private fun kniBridge569(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDataTask?, NSCachedURLResponse?) -> NSCachedURLResponse?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDataTask>(p1), interpretObjCPointerOrNull<NSCachedURLResponse>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge568")
private external fun kniBridge568(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge571")
private external fun kniBridge571(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge570")
private fun kniBridge570(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDataTaskWillCacheResponseBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDataTask?, p2: NSCachedURLResponse?): NSCachedURLResponse? {
return interpretObjCPointerOrNull<NSCachedURLResponse>(kniBridge571(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge573")
private fun kniBridge573(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLSession>(p0))
}
@SymbolName("com_afnetworking_kniBridge572")
private external fun kniBridge572(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge575")
private external fun kniBridge575(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge574")
private fun kniBridge574(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDidFinishEventsForBackgroundURLSessionBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?): Unit {
return kniBridge575(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge577")
private fun kniBridge577(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, NSURL?) -> NSURL?>(interpretObjCPointerOrNull<Any>(p3))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), interpretObjCPointerOrNull<NSURL>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge576")
private external fun kniBridge576(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge579")
private external fun kniBridge579(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge578")
private fun kniBridge578(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidFinishDownloadingBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: NSURL?): NSURL? {
return interpretObjCPointerOrNull<NSURL>(kniBridge579(p0.objcPtr(), p1.objcPtr(), p2.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue))} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge581")
private fun kniBridge581(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p5))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), p2, p3, p4)
}
@SymbolName("com_afnetworking_kniBridge580")
private external fun kniBridge580(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: Long, p5: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge582")
private fun kniBridge582(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidWriteDataBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: int64_t, p3: int64_t, p4: int64_t): Unit {
return kniBridge583(p0.objcPtr(), p1.objcPtr(), p2, p3, p4, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge585")
private fun kniBridge585(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSession?, NSURLSessionDownloadTask?, int64_t, int64_t) -> Unit>(interpretObjCPointerOrNull<Any>(p4))(interpretObjCPointerOrNull<NSURLSession>(p0), interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p1), p2, p3)
}
@SymbolName("com_afnetworking_kniBridge584")
private external fun kniBridge584(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge587")
private external fun kniBridge587(p0: NativePtr, p1: NativePtr, p2: Long, p3: Long, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge586")
private fun kniBridge586(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setDownloadTaskDidResumeBlock(block = p1.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSession?, p1: NSURLSessionDownloadTask?, p2: int64_t, p3: int64_t): Unit {
return kniBridge587(p0.objcPtr(), p1.objcPtr(), p2, p3, interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge588")
private external fun kniBridge588(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge589")
private fun kniBridge589(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().session().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge590")
private external fun kniBridge590(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge591")
private fun kniBridge591(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().operationQueue().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge592")
private external fun kniBridge592(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge593")
private fun kniBridge593(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().responseSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge594")
private external fun kniBridge594(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge595")
private fun kniBridge595(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setResponseSerializer(responseSerializer = interpretObjCPointerOrNull<AFURLResponseSerializationProtocol>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge597")
private fun kniBridge597(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().securityPolicy().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge598")
private external fun kniBridge598(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge599")
private fun kniBridge599(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setSecurityPolicy(securityPolicy = interpretObjCPointerOrNull<AFSecurityPolicy>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge600")
private external fun kniBridge600(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge601")
private fun kniBridge601(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().reachabilityManager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge602")
private external fun kniBridge602(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge603")
private fun kniBridge603(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setReachabilityManager(reachabilityManager = interpretObjCPointerOrNull<AFNetworkReachabilityManager>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge605")
private fun kniBridge605(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().tasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge607")
private fun kniBridge607(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().dataTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge608")
private external fun kniBridge608(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge609")
private fun kniBridge609(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().uploadTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge611")
private fun kniBridge611(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().downloadTasks().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge613")
private fun kniBridge613(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().completionQueue().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge614")
private external fun kniBridge614(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge615")
private fun kniBridge615(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setCompletionQueue(completionQueue = interpretObjCPointerOrNull<NSObject>(p1))
}
@SymbolName("com_afnetworking_kniBridge616")
private external fun kniBridge616(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge617")
private fun kniBridge617(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().completionGroup().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge618")
private external fun kniBridge618(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge619")
private fun kniBridge619(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setCompletionGroup(completionGroup = interpretObjCPointerOrNull<NSObject>(p1))
}
@SymbolName("com_afnetworking_kniBridge620")
private external fun kniBridge620(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge621")
private fun kniBridge621(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().attemptsToRecreateUploadTasksForBackgroundSessions().toByte()
}
@SymbolName("com_afnetworking_kniBridge622")
private external fun kniBridge622(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge623")
private fun kniBridge623(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().setAttemptsToRecreateUploadTasksForBackgroundSessions(attemptsToRecreateUploadTasksForBackgroundSessions = p1.toBoolean())
}
@SymbolName("com_afnetworking_kniBridge624")
private external fun kniBridge624(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge625")
private fun kniBridge625(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge626")
private external fun kniBridge626(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge627")
private fun kniBridge627(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge628")
private external fun kniBridge628(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge629")
private fun kniBridge629(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge630")
private external fun kniBridge630(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge631")
private fun kniBridge631(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().`class`().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge632")
private external fun kniBridge632(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge633")
private fun kniBridge633(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge634")
private external fun kniBridge634(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge635")
private fun kniBridge635(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge636")
private external fun kniBridge636(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge637")
private fun kniBridge637(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge638")
private external fun kniBridge638(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge639")
private fun kniBridge639(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isProxy().toByte()
}
@SymbolName("com_afnetworking_kniBridge640")
private external fun kniBridge640(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge641")
private fun kniBridge641(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge642")
private external fun kniBridge642(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge643")
private fun kniBridge643(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge644")
private external fun kniBridge644(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge645")
private fun kniBridge645(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge647")
private fun kniBridge647(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_afnetworking_kniBridge648")
private external fun kniBridge648(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge649")
private fun kniBridge649(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().hash()
}
@SymbolName("com_afnetworking_kniBridge650")
private external fun kniBridge650(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge651")
private fun kniBridge651(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().superclass().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge652")
private external fun kniBridge652(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge653")
private fun kniBridge653(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().description().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge654")
private external fun kniBridge654(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge655")
private fun kniBridge655(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, downloadTask = interpretObjCPointerOrNull<NSURLSessionDownloadTask>(p2)!!, didFinishDownloadingToURL = interpretObjCPointerOrNull<NSURL>(p3)!!)
}
@SymbolName("com_afnetworking_kniBridge656")
private external fun kniBridge656(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge657")
private fun kniBridge657(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge658")
private external fun kniBridge658(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge659")
private fun kniBridge659(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge660")
private external fun kniBridge660(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge661")
private fun kniBridge661(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().debugDescription().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge662")
private external fun kniBridge662(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge663")
private fun kniBridge663(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, didBecomeInvalidWithError = interpretObjCPointerOrNull<NSError>(p2))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge665")
private fun kniBridge665(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLCredential>(p1))
}
@SymbolName("com_afnetworking_kniBridge664")
private external fun kniBridge664(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge667")
private external fun kniBridge667(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge666")
private fun kniBridge666(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, didReceiveChallenge = interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p2)!!, completionHandler = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionAuthChallengeDisposition, p1: NSURLCredential?): Unit {
return kniBridge667(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge668")
private external fun kniBridge668(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge669")
private fun kniBridge669(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSessionDidFinishEventsForBackgroundURLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge671")
private fun kniBridge671(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDelayedRequestDisposition, NSURLRequest?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLRequest>(p1))
}
@SymbolName("com_afnetworking_kniBridge670")
private external fun kniBridge670(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge673")
private external fun kniBridge673(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge672")
private fun kniBridge672(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, willBeginDelayedRequest = interpretObjCPointerOrNull<NSURLRequest>(p3)!!, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionDelayedRequestDisposition, p1: NSURLRequest?): Unit {
return kniBridge673(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge674")
private external fun kniBridge674(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge675")
private fun kniBridge675(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, taskIsWaitingForConnectivity = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!)
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge677")
private fun kniBridge677(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLRequest?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLRequest>(p0))
}
@SymbolName("com_afnetworking_kniBridge676")
private external fun kniBridge676(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge679")
private external fun kniBridge679(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge678")
private fun kniBridge678(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, willPerformHTTPRedirection = interpretObjCPointerOrNull<NSHTTPURLResponse>(p3)!!, newRequest = interpretObjCPointerOrNull<NSURLRequest>(p4)!!, completionHandler = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLRequest?): Unit {
return kniBridge679(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge681")
private fun kniBridge681(p0: Long, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionAuthChallengeDisposition, NSURLCredential?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0, interpretObjCPointerOrNull<NSURLCredential>(p1))
}
@SymbolName("com_afnetworking_kniBridge680")
private external fun kniBridge680(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge683")
private external fun kniBridge683(p0: Long, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge682")
private fun kniBridge682(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didReceiveChallenge = interpretObjCPointerOrNull<NSURLAuthenticationChallenge>(p3)!!, completionHandler = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSURLSessionAuthChallengeDisposition, p1: NSURLCredential?): Unit {
return kniBridge683(p0, p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge685")
private fun kniBridge685(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSInputStream?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSInputStream>(p0))
}
@SymbolName("com_afnetworking_kniBridge684")
private external fun kniBridge684(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge687")
private external fun kniBridge687(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge686")
private fun kniBridge686(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, needNewBodyStream = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) throw NullPointerException() else fun(p0: NSInputStream?): Unit {
return kniBridge687(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} })
}
@SymbolName("com_afnetworking_kniBridge688")
private external fun kniBridge688(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: Long, p5: Long, p6: Long): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge689")
private fun kniBridge689(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long, p4: Long, p5: Long): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didSendBodyData = p3, totalBytesSent = p4, totalBytesExpectedToSend = p5)
}
@SymbolName("com_afnetworking_kniBridge690")
private external fun kniBridge690(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge691")
private fun kniBridge691(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didFinishCollectingMetrics = interpretObjCPointerOrNull<NSURLSessionTaskMetrics>(p3)!!)
}
@SymbolName("com_afnetworking_kniBridge692")
private external fun kniBridge692(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge693")
private fun kniBridge693(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFURLSessionManager>().URLSession(session = interpretObjCPointerOrNull<NSURLSession>(p1)!!, task = interpretObjCPointerOrNull<NSURLSessionTask>(p2)!!, didCompleteWithError = interpretObjCPointerOrNull<NSError>(p3))
}
@SymbolName("com_afnetworking_kniBridge694")
private external fun kniBridge694(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge695")
private fun kniBridge695(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().manager().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge696")
private external fun kniBridge696(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge697")
private fun kniBridge697(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().new().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge698")
private external fun kniBridge698(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge699")
private fun kniBridge699(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge700")
private external fun kniBridge700(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge701")
private fun kniBridge701(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().alloc().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge702")
private external fun kniBridge702(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge703")
private fun kniBridge703(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManagerMeta>().supportsSecureCoding().toByte()
}
@SymbolName("com_afnetworking_kniBridge704")
private external fun kniBridge704(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge705")
private fun kniBridge705(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithBaseURL(url = interpretObjCPointerOrNull<NSURL>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge706")
private external fun kniBridge706(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge707")
private fun kniBridge707(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithBaseURL(url = interpretObjCPointerOrNull<NSURL>(p1), sessionConfiguration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p2)).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge709")
private fun kniBridge709(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge710")
private fun kniBridge710(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge708")
private external fun kniBridge708(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge712")
private external fun kniBridge712(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge713")
private external fun kniBridge713(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge711")
private fun kniBridge711(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().GET(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge712(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge713(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge715")
private fun kniBridge715(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge716")
private fun kniBridge716(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge717")
private fun kniBridge717(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge714")
private external fun kniBridge714(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge719")
private external fun kniBridge719(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge720")
private external fun kniBridge720(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge721")
private external fun kniBridge721(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge718")
private fun kniBridge718(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().GET(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge719(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge720(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge721(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge723")
private fun kniBridge723(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge724")
private fun kniBridge724(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge722")
private external fun kniBridge722(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge726")
private external fun kniBridge726(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge727")
private external fun kniBridge727(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge725")
private fun kniBridge725(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().HEAD(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?): Unit {
return kniBridge726(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge727(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge729")
private fun kniBridge729(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge730")
private fun kniBridge730(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge728")
private external fun kniBridge728(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge732")
private external fun kniBridge732(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge733")
private external fun kniBridge733(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge731")
private fun kniBridge731(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge732(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge733(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge735")
private fun kniBridge735(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge736")
private fun kniBridge736(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge737")
private fun kniBridge737(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge734")
private external fun kniBridge734(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge739")
private external fun kniBridge739(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge740")
private external fun kniBridge740(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge741")
private external fun kniBridge741(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge738")
private fun kniBridge738(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), progress = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge739(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge740(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge741(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge743")
private fun kniBridge743(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge744")
private fun kniBridge744(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge745")
private fun kniBridge745(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge742")
private external fun kniBridge742(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge747")
private external fun kniBridge747(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge748")
private external fun kniBridge748(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge749")
private external fun kniBridge749(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge746")
private fun kniBridge746(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), constructingBodyWithBlock = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge747(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge748(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge749(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge751")
private fun kniBridge751(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(AFMultipartFormDataProtocol?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<AFMultipartFormDataProtocol>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge752")
private fun kniBridge752(p0: NativePtr, p1: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSProgress?) -> Unit>(interpretObjCPointerOrNull<Any>(p1))(interpretObjCPointerOrNull<NSProgress>(p0))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge753")
private fun kniBridge753(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge754")
private fun kniBridge754(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge750")
private external fun kniBridge750(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr, p7: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge756")
private external fun kniBridge756(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge757")
private external fun kniBridge757(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge758")
private external fun kniBridge758(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge759")
private external fun kniBridge759(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge755")
private fun kniBridge755(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr, p6: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().POST(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), constructingBodyWithBlock = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: AFMultipartFormDataProtocol?): Unit {
return kniBridge756(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, progress = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSProgress?): Unit {
return kniBridge757(p0.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, success = p5.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge758(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p6.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge759(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge761")
private fun kniBridge761(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge762")
private fun kniBridge762(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge760")
private external fun kniBridge760(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge764")
private external fun kniBridge764(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge765")
private external fun kniBridge765(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge763")
private fun kniBridge763(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().PUT(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge764(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge765(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge767")
private fun kniBridge767(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge768")
private fun kniBridge768(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge766")
private external fun kniBridge766(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge770")
private external fun kniBridge770(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge771")
private external fun kniBridge771(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge769")
private fun kniBridge769(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().PATCH(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge770(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge771(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge773")
private fun kniBridge773(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, Any?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<Any>(p1))
}
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge774")
private fun kniBridge774(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(NSURLSessionDataTask?, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(interpretObjCPointerOrNull<NSURLSessionDataTask>(p0), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_afnetworking_kniBridge772")
private external fun kniBridge772(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): NativePtr
@SymbolName("com_afnetworking_kniBridge776")
private external fun kniBridge776(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("com_afnetworking_kniBridge777")
private external fun kniBridge777(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge775")
private fun kniBridge775(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().DELETE(URLString = interpretObjCPointerOrNull<String>(p1)!!, parameters = interpretObjCPointerOrNull<Any>(p2), success = p3.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: Any?): Unit {
return kniBridge776(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }, failure = p4.let { kniBlockPtr -> if (kniBlockPtr == nativeNullPtr) null else fun(p0: NSURLSessionDataTask?, p1: NSError?): Unit {
return kniBridge777(p0.objcPtr(), p1.objcPtr(), interpretCPointer<COpaque>(kniBlockPtr).rawValue)} }).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge778")
private external fun kniBridge778(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge779")
private fun kniBridge779(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().baseURL().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge780")
private external fun kniBridge780(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge781")
private fun kniBridge781(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().requestSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge782")
private external fun kniBridge782(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge783")
private fun kniBridge783(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().setRequestSerializer(requestSerializer = interpretObjCPointerOrNull<AFHTTPRequestSerializer>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge784")
private external fun kniBridge784(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge785")
private fun kniBridge785(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().responseSerializer().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge786")
private external fun kniBridge786(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge787")
private fun kniBridge787(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().setResponseSerializer(responseSerializer = interpretObjCPointerOrNull<AFHTTPResponseSerializer>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge788")
private external fun kniBridge788(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge789")
private fun kniBridge789(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithSessionConfiguration(configuration = interpretObjCPointerOrNull<NSURLSessionConfiguration>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge790")
private external fun kniBridge790(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge791")
private fun kniBridge791(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().init().objcPtr())
}
@SymbolName("com_afnetworking_kniBridge792")
private external fun kniBridge792(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge793")
private fun kniBridge793(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge794")
private external fun kniBridge794(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge795")
private fun kniBridge795(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().encodeWithCoder(aCoder = interpretObjCPointerOrNull<NSCoder>(p1)!!)
}
@SymbolName("com_afnetworking_kniBridge796")
private external fun kniBridge796(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_afnetworking_kniBridge797")
private fun kniBridge797(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<AFHTTPSessionManager>().copyWithZone(zone = interpretCPointer<NSZone>(p1)).objcPtr())
}
@SymbolName("com_afnetworking_kniBridge798")
private external fun kniBridge798(): NativePtr
@SymbolName("com_afnetworking_kniBridge799")
private external fun kniBridge799(): NativePtr
@SymbolName("com_afnetworking_kniBridge800")
private external fun kniBridge800(): NativePtr
@SymbolName("com_afnetworking_kniBridge801")
private external fun kniBridge801(): NativePtr
@SymbolName("com_afnetworking_kniBridge802")
private external fun kniBridge802(): NativePtr
@SymbolName("com_afnetworking_kniBridge803")
private external fun kniBridge803(): NativePtr
@SymbolName("com_afnetworking_kniBridge804")
private external fun kniBridge804(): ULong
@SymbolName("com_afnetworking_kniBridge805")
private external fun kniBridge805(): Double
@SymbolName("com_afnetworking_kniBridge806")
private external fun kniBridge806(): NativePtr
@SymbolName("com_afnetworking_kniBridge807")
private external fun kniBridge807(): NativePtr
@SymbolName("com_afnetworking_kniBridge808")
private external fun kniBridge808(): NativePtr
@SymbolName("com_afnetworking_kniBridge809")
private external fun kniBridge809(): NativePtr
@SymbolName("com_afnetworking_kniBridge810")
private external fun kniBridge810(): NativePtr
@SymbolName("com_afnetworking_kniBridge811")
private external fun kniBridge811(): NativePtr
@SymbolName("com_afnetworking_kniBridge812")
private external fun kniBridge812(): NativePtr
@SymbolName("com_afnetworking_kniBridge813")
private external fun kniBridge813(): NativePtr
@SymbolName("com_afnetworking_kniBridge814")
private external fun kniBridge814(): NativePtr
@SymbolName("com_afnetworking_kniBridge815")
private external fun kniBridge815(): NativePtr
@SymbolName("com_afnetworking_kniBridge816")
private external fun kniBridge816(): NativePtr
@SymbolName("com_afnetworking_kniBridge817")
private external fun kniBridge817(): NativePtr
